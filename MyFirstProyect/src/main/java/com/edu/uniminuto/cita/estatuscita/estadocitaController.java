package com.edu.uniminuto.cita.estatuscita;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class estadocitaController {

	
	@GetMapping(value="estatus",produces=MediaType.TEXT_PLAIN_VALUE)
	public String estatus() {
		
		return "Activa"
				+"cancelada"
			  + "Re asignar";
	
	
	}
}