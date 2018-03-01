package br.com.fiap.scjdenisapi.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.scjdenisapi.model.Imoveis;
import br.com.fiap.scjdenisapi.repository.ImoveisRepository;

@Component
public class ImoveisComponent {

	@Autowired
	ImoveisRepository imoveisRepository;

	public void salvar(Imoveis imoveis) {
		List<Imoveis> imovel = imoveisRepository.findByTipo(imoveis.getTipo());
		if (!imovel.isEmpty()) {
			imoveis.setId(imovel.get(0).getId());
		}
		imoveisRepository.save(imoveis);
	}

	public Imoveis buscarImovel(String imovel) {

		List<Imoveis> tipo = imoveisRepository.findByTipo(imovel);

		if (tipo.isEmpty()) {
			return new Imoveis();
		} else {
			return tipo.get(0);
		}

	}

	public List<Imoveis> buscarTodos() {
		return imoveisRepository.findAll();
	}

	public void apagar(String imoveis) {

		List<Imoveis> tipo = imoveisRepository.findByTipo(imoveis);
		if (!tipo.isEmpty()) {
			imoveisRepository.delete(tipo.get(0));
		}
	}	
	
}
