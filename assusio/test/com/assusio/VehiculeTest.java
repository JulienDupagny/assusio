package com.assusio;

import org.junit.Assert;
import org.junit.Test;

public class VehiculeTest {

	@Test
	public void calculerPrixTest() {
		Vehicule vehicule1 = new Vehicule(1000);
		int prixCalcule = vehicule1.calculerPrix();
		Assert.assertEquals(1350, prixCalcule);
	}

	@Test(expected = RuntimeException.class)
	public void vehiculeTest() {
		new Vehicule(-1);
	}

}