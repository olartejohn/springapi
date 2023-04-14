package com.edu.uniminuto.cita.tipodeservicios;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class tiposervicioController {
	
	@GetMapping(value="casa",produces=MediaType.TEXT_PLAIN_VALUE)
	public String casa() {
		return "como van";
 	}
	

}
