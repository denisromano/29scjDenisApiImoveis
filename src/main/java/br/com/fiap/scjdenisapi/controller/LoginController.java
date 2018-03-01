package br.com.fiap.scjdenisapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.scjdenisapi.component.LoginComponent;
import br.com.fiap.scjdenisapi.model.Login;

@RestController
@CrossOrigin
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	public LoginComponent loginComponent;
	
	@GetMapping
	public List<Login> buscarTodos(){
		return loginComponent.buscarTodos();
	}
	
	@GetMapping("/usuario/{usuario}")
	public Login buscaUsuario (@PathVariable(value= "usuario") String usuario){
		return loginComponent.buscarLogin(usuario);
	}

	@DeleteMapping("/usuario/{usuario}")
	public void apagar(@PathVariable(value = "usuario") String usuario){
		loginComponent.apagar(usuario);
	}
	
	@PostMapping
	public void salvar(@RequestBody Login login){
		loginComponent.salvar(login);
	}

}
