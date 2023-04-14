package com.edu.uniminuto.catalogo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class vercatalogoController {
	@GetMapping(value="catalogo",produces=MediaType.TEXT_PLAIN_VALUE)
	public String catalogo() {
		
		return "Acrilicas"
				
				+"semi";
			  
	
	
	}

}
