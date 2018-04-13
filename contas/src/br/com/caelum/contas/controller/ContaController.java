package br.com.caelum.contas.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.sun.javafx.sg.prism.NGShape.Mode;

import br.com.caelum.contas.dao.ContaDAO;
import br.com.caelum.contas.modelo.Conta;

@Controller
public class ContaController {

	@RequestMapping("/formulario")
	public String formulario () {
		return "formulario";
	}
	
	@RequestMapping("/adiciona")
	public String adiciona(Conta conta) {
		
		ContaDAO dao = new ContaDAO();
		dao.adiciona(conta);
		
		return "conta-adicionada";
	}
	
	@RequestMapping("listar")
	public ModelAndView lista() {
		
		ContaDAO dao = new ContaDAO();
		List<Conta> contas= dao.lista();
		
		ModelAndView mv = new ModelAndView("lista");
		mv.addObject("contas", contas);
		return mv;
	}
}
