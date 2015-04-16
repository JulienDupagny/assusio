package com.assusio;

class Moto extends Vehicule {
	public boolean antivol;

	public void setAntivol() {
		this.antivol = true;
	}

	public void removeAntivol() {
		this.antivol = false;
	}

	public boolean hasAntivol() {
		return antivol;
	}
}