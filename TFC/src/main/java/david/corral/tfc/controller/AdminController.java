package david.corral.tfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
	@GetMapping("/usuarios")
    public String mostrarUsuarios (Clientes c, Model model) {
    	List <Clientes> lista = cServ.buscarTodos();
    	model.addAttribute("c", lista);
    	System.out.println(lista);
		return "/admin/adminUsuarios";
    }
	
	@GetMapping("/usuarios/edit/{id}")
    public String editUsuario (@PathVariable("id") int idCliente, Model model) {
    	Clientes cliente = cServ.findById(idCliente);
    	model.addAttribute("c", cliente);
		return "/admin/usuraiosForm";
    }
	
	//	ADMIN - PRODUCTOS
	@GetMapping("/productos")
    public String mostrarProductos (Productos p, Model model) {
    	List <Productos> lista = pServ.buscarTodos();
    	model.addAttribute("p", lista);
    	System.out.println(lista);
		return "/admin/adminProductos";
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
	
	@GetMapping("/coches")
    public String mostrarCoches (Coches c, Model model) {
		List <Coches> lista = coServ.buscarTodos();
    	model.addAttribute("c", lista);
    	System.out.println(lista);
		return "/admin/adminCoches";
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
	@GetMapping("/empleados")
    public String mostrarEmpelados (Model model) {
		List <Empleados> listaEmpleados = eServ.buscarTodos();
		List <Concesionario> listaConcesionarios = conServ.buscarTodos();
    	model.addAttribute("emp", listaEmpleados);
    	model.addAttribute("con", listaConcesionarios);
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
}
