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

import br.com.fiap.scjdenisapi.component.ImoveisComponent;
import br.com.fiap.scjdenisapi.model.Imoveis;

@RestController
@CrossOrigin
@RequestMapping(value = "/imoveis")
public class ImoveisController {

		@Autowired
		public ImoveisComponent imoveisComponent;
		
		@GetMapping
		public List<Imoveis> buscarTodos(){
			return imoveisComponent.buscarTodos();
		}
		
		@GetMapping("/imovel/{imovel}")
		public Imoveis buscaImovel (@PathVariable(value= "imovel") String imovel){
			return imoveisComponent.buscarImovel(imovel);
		}

		@DeleteMapping("/imovel/{imovel}")
		public void apagar(@PathVariable(value = "imovel") String usuario){
			imoveisComponent.apagar(usuario);
		}
		
		@PostMapping
		public void salvar(@RequestBody Imoveis imoveis){
			imoveisComponent.salvar(imoveis);
		}	
	
}	