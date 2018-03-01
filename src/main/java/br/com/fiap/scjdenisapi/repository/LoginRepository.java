package br.com.fiap.scjdenisapi.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.fiap.scjdenisapi.model.Login;

public interface LoginRepository extends MongoRepository<Login, String>{
	
	List<Login> findByUsuario(String usuario);

}
