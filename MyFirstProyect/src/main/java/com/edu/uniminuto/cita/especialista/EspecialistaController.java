package com.edu.uniminuto.cita.especialista;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EspecialistaController {
	
	@GetMapping(value="escogerespecialista",produces=MediaType.TEXT_PLAIN_VALUE)
	public String escogerespecialista() {
		
		return "vivian"
				+"marcela"
			  + "esteban";
	
	
	}
	

}
