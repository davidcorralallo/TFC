package david.corral.tfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import david.corral.tfc.entity.Clientes;
import david.corral.tfc.entity.Coches;
import david.corral.tfc.entity.Productos;
import david.corral.tfc.service.ClientesServiceImp;
import david.corral.tfc.service.CochesServiceImp;
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
		return "/admin/productosForm";
    }
	
	@GetMapping("/productos/delete/{id}")
    public String eliminarProductos(@PathVariable("id") int idProducto, Model model) {
        System.out.println("Borrado del producto: " + idProducto);
        coServ.eliminarCoche(idProducto);
        return "redirect:/admin/productos";
    }
	
	
	//	ADMIN - COCHES
	@GetMapping("/coches")
    public String mostrarCoches (Clientes co, Model model) {
		List <Coches> lista = coServ.buscarTodos();
    	model.addAttribute("c", lista);
    	System.out.println(lista);
		return "/admin/adminCoches";
    }
	
	@GetMapping("/coches/edit/{id}")
    public String editCoche (@PathVariable("id") int idCoche, Model model) {
    	Coches coche = coServ.findById(idCoche);
    	model.addAttribute("c", coche);
		return "/admin/cochesForm";
    }
	
	@GetMapping("/coches/delete/{id}")
    public String eliminarCoche(@PathVariable("id") int idCoche, Model model) {
        System.out.println("Borrado del coche: " + idCoche);
        coServ.eliminarCoche(idCoche);
        return "redirect:/admin/coches";
    }
	
}
