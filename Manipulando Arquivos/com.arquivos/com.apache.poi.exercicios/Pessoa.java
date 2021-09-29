package com.apache.poi.exercicios;

public class Pessoa {
	
	private String nome;
	private String email;
	private int idade;
	
	
	public Pessoa(String n, String e, int i) {
		this.nome = n;
		this.email = e;
		this.idade = i;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getIdade() {
		return idade;
	}
	
	

}
