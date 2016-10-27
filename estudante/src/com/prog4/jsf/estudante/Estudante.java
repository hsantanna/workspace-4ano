package com.prog4.jsf.estudante;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Estudante {
	
	private String firstName;
	private String lastName;
	private String pais;
	private String linguagemFavorita;
	
	
	// como a resposta do h:selectManyCheckbox pode incluir mais de uma
	// resposta marcada, é preciso que seja um vetor
	private String[] linguagensFavoritas;
	
	// lista de países para selecionar na caixa de seleção
	List<String> opcoesPais;
	
	public Estudante(){
		
		//popular dados do formulário com valores já preenchidos
		firstName = "João";
		lastName = "da Silva";
		pais = "France";
	
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

	public String getLinguagemFavorita() {
		return linguagemFavorita;
	}

	public void setLinguagemFavorita(String linguagemFavorita) {
		this.linguagemFavorita = linguagemFavorita;
	}

	public String[] getLinguagensFavoritas() {
		return linguagensFavoritas;
	}

	public void setLinguagensFavoritas(String[] linguagensFavoritas) {
		this.linguagensFavoritas = linguagensFavoritas;
	}
	
	
	
}
