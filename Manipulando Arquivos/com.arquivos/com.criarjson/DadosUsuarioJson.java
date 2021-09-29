package com.criarjson;

public class DadosUsuarioJson {
	
	private String nome;
	private String email;
	private String dataCadastro;
	
	public DadosUsuarioJson(String n, String e, String d) {
		
		this.nome = n;
		this.email = e;
		this.dataCadastro = d;
		
	}
	
	public String getDataCadastro() {
		return dataCadastro;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getNome() {
		return nome;
	}

}
