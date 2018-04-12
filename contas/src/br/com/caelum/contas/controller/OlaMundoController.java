package br.com.caelum.contas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {

	@RequestMapping("/olaMundoSpring")
	public String retornaJSPOK () {
		System.out.println("A JSP foi carregada corretamente!");
		return "ok";
	}
	
}
