package br.com.fiap.scjdenisapi.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.fiap.scjdenisapi.model.Imoveis;

public interface ImoveisRepository extends MongoRepository<Imoveis, String> {
	
	List<Imoveis> findByTipo(String tipo);

}
