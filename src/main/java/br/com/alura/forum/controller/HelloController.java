package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Indica para o Spring que essa classe é um controller
@Controller
public class HelloController {

	//Mapeia a url localhos:8080/ para esse metodo
	@RequestMapping("/")
	@ResponseBody
	public String Hello() {
		return "<h1>Hello World</h1>";
	}
}
