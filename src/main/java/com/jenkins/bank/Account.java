package com.jenkins.bank;

public class Account {
	
	private String nom, prenom, type;
	private int id, valeur;
	private double taux;
	
	
	public Account(String nom, String prenom, String type, int id, int valeur) {
		this.nom = nom;
		this.prenom = prenom;
		this.type = type;
		this.id = id;
		this.valeur = valeur;
	};
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getValeur() {
		return valeur;
	}
	
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
		
}