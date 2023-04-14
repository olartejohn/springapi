package com.edu.uniminuto.cita.disponibilidad;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DisponibilidadController {

	@GetMapping(value="disponibilidad",produces=MediaType.TEXT_PLAIN_VALUE)
	public String disponibilidad() {
		
		return "disponible"
				+"no disponible";
			  
	
	
	}
	
	
	
}
