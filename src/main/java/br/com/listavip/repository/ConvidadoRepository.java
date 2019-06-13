package br.com.listavip.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.listavip.models.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {

}
