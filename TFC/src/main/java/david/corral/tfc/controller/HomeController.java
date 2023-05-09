package david.corral.tfc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	
	@GetMapping("/h")
    public String mostrarHeader() {
    	return "/fragments/header";
    }
	@GetMapping("/f")
    public String mostrarFooter() {
    	return "/fragments/footer";
    }
	@GetMapping("/")
    public String mostrarHome() {
    	return "/home";
    }
	
}
