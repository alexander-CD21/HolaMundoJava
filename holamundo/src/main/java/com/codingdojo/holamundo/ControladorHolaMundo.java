package com.codingdojo.holamundo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorHolaMundo {
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String hola() {
		return "Hello Human";
	}
	
	@RequestMapping(value = "/fullname", method=RequestMethod.GET)
	public String index(@RequestParam(value="name")String nombre,@RequestParam String apellido) {
		return "Hello " + nombre + " " + apellido;
	}
	
	@RequestMapping(value = "/repeticion", method=RequestMethod.GET)
	public String repeticion(@RequestParam(value="name")String nombre,@RequestParam int veces) {
		
		String repeatstr="hello " + nombre + " ";
		for(int i=0;i<veces;i++) {
			 repeatstr+="hello "+ nombre + " ";
		}
		return repeatstr;
	}

}
