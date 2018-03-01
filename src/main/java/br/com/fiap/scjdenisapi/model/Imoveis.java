package br.com.fiap.scjdenisapi.model;

import org.springframework.data.annotation.Id;

public class Imoveis {

	
	@Id
	private String id;
	private String tipo;
	private String localizacao;
	private String tamanho;
	private String ano;	
	private String valor;
	private String quartos;
	private String banheiros;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getQuartos() {
		return quartos;
	}
	public void setQuartos(String quartos) {
		this.quartos = quartos;
	}
	public String getBanheiros() {
		return banheiros;
	}
	public void setBanheiros(String banheiros) {
		this.banheiros = banheiros;
	}
	
	
	
}
