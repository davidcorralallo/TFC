package david.corral.tfc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
    public String mostrarHome() {
    	return "/Home";
    }
	
	@GetMapping("/singup")
    public String mostrarSingUp() {
    	return "/singup";
    }
	
	@GetMapping("/log")
    public String mostrarLogIn() {
    	return "/logIn";
    }
	
	@GetMapping("/admin")
    public String mostrarAdmin() {
    	return "/admin";
    }
}
