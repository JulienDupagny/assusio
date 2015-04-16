package com.assusio;

public class Vehicule {
	public int prix;
	public String nom;

	public Option option1 = new Option(150, "");
	public Option option2 = new Option(200, "");

	public int calculerPrix() {
		return prix + option1.prix + option2.prix;
	}

	public Vehicule() {

	}

	public Vehicule(int prix) {

		if (prix < 0) {
			throw new RuntimeException("prix non valide");
		}
		this.prix = prix;
	}
}