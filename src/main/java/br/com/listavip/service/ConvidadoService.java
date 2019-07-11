package br.com.listavip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.listavip.model.Convidado;
import br.com.listavip.repository.ConvidadoRepository;

@Service
public class ConvidadoService {

	@Autowired
	private ConvidadoRepository convidadoRepository;
	
	public Iterable<Convidado> obterTodos(){
		return convidadoRepository.findAll();
	}
	
	public void salvar(Convidado convidado) {
		convidadoRepository.save(convidado);
	}
}
