package com.edu.uniminuto.cita;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CitaController {

	@GetMapping(value="crear",produces=MediaType.TEXT_PLAIN_VALUE)
	public String crear() {
		
		return "disponible"
				
				+"no disponible";
			  
	
	
	}
}
