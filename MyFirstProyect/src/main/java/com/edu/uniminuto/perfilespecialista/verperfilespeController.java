package com.edu.uniminuto.perfilespecialista;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.edu.uniminuto.modelo.Especialista;
@RestController
public class verperfilespeController {

	/*@GetMapping(value="Especialistas",produces=MediaType.TEXT_PLAIN_VALUE)*/
	@RequestMapping(value="especialista", method=RequestMethod.GET)
	public Especialista especialistas() {
		
		return new Especialista( 191993L, "Esteban", "+57 322787763", "john@sinbugs.com");
		
 	}
	
	
	
	
	
	
	
	
}
