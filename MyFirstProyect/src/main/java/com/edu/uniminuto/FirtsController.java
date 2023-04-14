package com.edu.uniminuto;






import org.springframework.http.MediaType;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirtsController {
	
	
	
	/***
	 * 
	 * peticiones : 
	 * 
	 * 
	 * 			Get-> solicitud de informacion 
	 * 			Post-> solicitud de inseccion de datos 
	 * 			Put-> Solicitud de atualizacion de datos
	 * 			Delete-> eliminar datos
	 * 
	
	 
	@GetMapping(value="saludar",produces=MediaType.TEXT_PLAIN_VALUE)
	public String saludar() {
		return "Hello stydent de la uniminuto";
 	}
	**/
	/**
	@GetMapping(value="sumar/{num1}/{num2")
	public double sumar(@PathVariable("num1")double n1,@PathVariable ("num2") double n2 ) {
		return n1+n2;
	}
**/
	
	
	
}

