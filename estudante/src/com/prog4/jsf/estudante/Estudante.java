package com.prog4.jsf.estudante;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Estudante {
	
	private String firstName;
	private String lastName;
	private String pais;
	
	// lista de países para selecionar na caixa de seleção
	List<String> opcoesPais;
	
	public Estudante(){
		
			// preenche lista de países
			opcoesPais = new ArrayList<>();
				
			opcoesPais.add("Brasil");
			opcoesPais.add("France");
			opcoesPais.add("Germany");
			opcoesPais.add("India");
			opcoesPais.add("Turkey");
			opcoesPais.add("United Kingdom");
			opcoesPais.add("United States");
		
	}
	
	public String salvar(){
		
		return "estudante_resposta"; 
	}

	public List<String> getOpcoesPais() {
		return opcoesPais;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	
}
