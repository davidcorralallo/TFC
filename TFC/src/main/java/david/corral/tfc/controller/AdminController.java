package david.corral.tfc.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import david.corral.tfc.entity.Clientes;
import david.corral.tfc.entity.Coches;
import david.corral.tfc.entity.Concesionario;
import david.corral.tfc.entity.Empleados;
import david.corral.tfc.entity.Productos;
import david.corral.tfc.enums.Cambio;
import david.corral.tfc.enums.Combustible;
import david.corral.tfc.enums.Marcas;
import david.corral.tfc.enums.Propulsion;
import david.corral.tfc.enums.Puesto;
import david.corral.tfc.enums.Traccion;
import david.corral.tfc.service.ClientesServiceImp;
import david.corral.tfc.service.CochesServiceImp;
import david.corral.tfc.service.ConcesionarioServiceImp;
import david.corral.tfc.service.EmpleadoServiceImp;
import david.corral.tfc.service.ProductosServiceImp;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

	@Autowired
	ClientesServiceImp cServ;
	
	@Autowired
	CochesServiceImp coServ;
	
	@Autowired
	ProductosServiceImp pServ;
	
	@Autowired
	EmpleadoServiceImp eServ;
	
	@Autowired
	ConcesionarioServiceImp conServ;
	
	
	//	ADMIN - USUARIOS
	@GetMapping(value ="/usuarios")
	public String findAllClientes(@RequestParam Map<String, Object> params, Model model) {
		int page = params.get("page") != null ? (Integer.valueOf(params.get("page").toString()) - 1) : 0;
		
		PageRequest pageRequest = PageRequest.of(page, 10);
		
		Page<Clientes> pageCliente = cServ.buscarTodosPageable(pageRequest);

		
		int totalPage = pageCliente.getTotalPages();
		if(totalPage > 0) {
			List<Integer> pages = IntStream.rangeClosed(1, totalPage).boxed().collect(Collectors.toList());
			model.addAttribute("pages", pages);
		}
		
		model.addAttribute("c", pageCliente.getContent());
		model.addAttribute("current", page + 1);
		model.addAttribute("next", page + 2);
		model.addAttribute("prev", page);
		model.addAttribute("last", totalPage);
		System.out.println(pageCliente);
		return "/admin/adminUsuarios";
	}
	
	@GetMapping("/usuarios/edit/{id}")
    public String editUsuario (@PathVariable("id") int idCliente, Model model) {
    	Clientes cliente = cServ.findById(idCliente);
    	model.addAttribute("c", cliente);
		return "/admin/usuraiosForm";
    }
	
	@GetMapping("/usuarios/cambiar-estatus/{id}")
	public String cambiarEstatusUsuario(@PathVariable("id") int idCliente) {
	    Clientes cliente = cServ.findById(idCliente);
	    if (cliente != null) {
	        int nuevoEstatus = cliente.getEstatus() == 0 ? 1 : 0; // Cambiar el estatus
	        cliente.setEstatus(nuevoEstatus);
	        cServ.saveCliente(cliente);
	    }
	    return "redirect:/admin/usuarios";
	}
	
	//	ADMIN - PRODUCTOS
	@GetMapping(value ="/productos")
	public String findAllProductos(@RequestParam Map<String, Object> params, Model model) {
		int page = params.get("page") != null ? (Integer.valueOf(params.get("page").toString()) - 1) : 0;
		
		PageRequest pageRequest = PageRequest.of(page, 10);
		
		Page<Productos> pageProducto = pServ.buscarTodosPageable(pageRequest);
		
		int totalPage = pageProducto.getTotalPages();
		if(totalPage > 0) {
			List<Integer> pages = IntStream.rangeClosed(1, totalPage).boxed().collect(Collectors.toList());
			model.addAttribute("pages", pages);
		}
		
		model.addAttribute("p", pageProducto.getContent());
		model.addAttribute("current", page + 1);
		model.addAttribute("next", page + 2);
		model.addAttribute("prev", page);
		model.addAttribute("last", totalPage);
		System.out.println(pageProducto);
		return "/admin/adminProductos";
	}
	
	@GetMapping("/productos/añadir")
	public String añadirProducto(Productos producto, Model model) {
		model.addAttribute("p", producto);
		return "/admin/forms/ProductosForm";
	}
	
	
	@GetMapping("/productos/edit/{id}")
    public String editProducto (@PathVariable("id") int idProducto, Model model) {
    	Productos producto = pServ.findById(idProducto);
    	model.addAttribute("p", producto);
		return "/admin/forms/ProductosForm";
    }
	
	@GetMapping("/productos/delete/{id}")
    public String eliminarProductos(@PathVariable("id") int idProducto, Model model) {
        System.out.println("Borrado del producto: " + idProducto);
        pServ.eliminarProducto(idProducto);
        return "redirect:/admin/productos";
    }
	
	@PostMapping("/productos/save")
    public String guardarProducto(Productos producto) {
        pServ.save(producto);
        System.out.println(producto);
        return "redirect:/admin/productos";
    }
	//	ADMIN - COCHES
	
	@GetMapping(value ="/coches")
	public String findAllCoches (@RequestParam Map<String, Object> params, Model model) {
		int page = params.get("page") != null ? (Integer.valueOf(params.get("page").toString()) - 1) : 0;
		
		PageRequest pageRequest = PageRequest.of(page, 10);
		
		Page<Coches> pageCoche = coServ.buscarTodosPageable(pageRequest);
		
		int totalPage = pageCoche.getTotalPages();
		if(totalPage > 0) {
			List<Integer> pages = IntStream.rangeClosed(1, totalPage).boxed().collect(Collectors.toList());
			model.addAttribute("pages", pages);
		}
		
		model.addAttribute("c", pageCoche.getContent());
		model.addAttribute("current", page + 1);
		model.addAttribute("next", page + 2);
		model.addAttribute("prev", page);
		model.addAttribute("last", totalPage);
		System.out.println(pageCoche);
		return "/admin/adminCoches";
	}
	
	@GetMapping("/coches/añadir")
	public String añadirProducto(Coches coche, Model model) {
		model.addAttribute("c", coche);
		model.addAttribute("marca",Marcas.values());
    	model.addAttribute("cambio",Cambio.values());
    	model.addAttribute("combustible",Combustible.values());
    	model.addAttribute("traccion",Traccion.values());
    	model.addAttribute("propulsion",Propulsion.values());
		return "/admin/forms/CochesForm";
	}
	
	@GetMapping("/coches/edit/{id}")
    public String editCoche (@PathVariable("id") int idCoche, Model model) {
    	Coches coche = coServ.findById(idCoche);
    	model.addAttribute("c", coche);
    	model.addAttribute("marca",Marcas.values());
    	model.addAttribute("cambio",Cambio.values());
    	model.addAttribute("combustible",Combustible.values());
    	model.addAttribute("traccion",Traccion.values());
    	model.addAttribute("propulsion",Propulsion.values());
		return "/admin/forms/CochesForm";
    }
	
	@GetMapping("/coches/delete/{id}")
    public String eliminarCoche(@PathVariable("id") int idCoche, Model model) {
        System.out.println("Borrado del coche: " + idCoche);
        coServ.eliminarCoche(idCoche);
        return "redirect:/admin/coches";
    }
	
	@PostMapping("/coches/save")
    public String guardarCoche(Coches coche) {
        coServ.save(coche);
        System.out.println(coche);
        return "redirect:/admin/coches";
    }
	
//	ADMIN - EMPLEADOS
	@GetMapping(value ="/empleados")
	public String findAllEmpleados(@RequestParam Map<String, Object> params, Model model) {
		int page = params.get("page") != null ? (Integer.valueOf(params.get("page").toString()) - 1) : 0;
		
		PageRequest pageRequest = PageRequest.of(page, 10);
		
		Page<Empleados> pageEmpleado = eServ.buscarTodosPageable(pageRequest);
		List <Concesionario> listaConcesionarios = conServ.buscarTodos();

		
		int totalPage = pageEmpleado.getTotalPages();
		if(totalPage > 0) {
			List<Integer> pages = IntStream.rangeClosed(1, totalPage).boxed().collect(Collectors.toList());
			model.addAttribute("pages", pages);
		}
		
    	model.addAttribute("con", listaConcesionarios);
		model.addAttribute("emp", pageEmpleado.getContent());
		model.addAttribute("current", page + 1);
		model.addAttribute("next", page + 2);
		model.addAttribute("prev", page);
		model.addAttribute("last", totalPage);
		System.out.println(pageEmpleado);
		return "/admin/adminEmpleados";
	}
	
	@GetMapping("/empleados/edit/{id}")
    public String editEmpleado (@PathVariable("id") int idEmpleado, Model model) {
    	Empleados empleado = eServ.findById(idEmpleado);
		List <Concesionario> listaConcesionarios = conServ.buscarTodos();
    	model.addAttribute("e", empleado);
    	model.addAttribute("puesto",Puesto.values());
    	model.addAttribute("con", listaConcesionarios);
		return "/admin/forms/EmpleadoForm";
    }
	
	@GetMapping("/empleados/delete/{id}")
    public String eliminarEmpleado(@PathVariable("id") int idEmpleado, Model model) {
        System.out.println("Borrado del empleado: " + idEmpleado);
        eServ.eliminarEmpleado(idEmpleado);
        return "redirect:/admin/empleados";
    }
	
	@PostMapping("/empleados/save")
    public String guardar(Empleados empleado) {
        eServ.save(empleado);
        System.out.println(empleado);
        return "redirect:/admin/empleados";
    }
	
	@GetMapping("/empleados/añadir")
	public String añadirEmpleado(Empleados empleado, Model model) {
		List <Concesionario> listaConcesionarios = conServ.buscarTodos();
		model.addAttribute("e", empleado);
		model.addAttribute("puesto",Puesto.values());
    	model.addAttribute("con", listaConcesionarios);
		return "/admin/forms/EmpleadoForm";
	}
}
