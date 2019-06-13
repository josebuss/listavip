package br.com.listavip.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.listavip.models.Convidado;
import br.com.listavip.repository.ConvidadoRepository;

@Controller
public class ConvidadoController {
	
	@Autowired
	private ConvidadoRepository convidadoRepository;

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("listaconvidados")
	public String listaConvidados(Model model) {
		Iterable<Convidado> convidados = convidadoRepository.findAll();
		model.addAttribute("convidados", convidados);
		return "listaconvidados";
	}
}
