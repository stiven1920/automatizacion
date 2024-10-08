package com.example.demo;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class CarritoFlores extends PageObject{
	
	private final By cantidadFlores = By.cssSelector("input[type='number']");
	private final By btnComprar = By.cssSelector("button[type='submit']");
	private final By textoFinalizar = By.cssSelector("#post-196 > header > h1");
	
	public By getCantidadFlores() {
		return cantidadFlores;
	}
	
	public By getBtnComprar() {
		return btnComprar;
	}

	public By getTextoFinalizar() {
		return textoFinalizar;
	}
	
	

	
	
	
}
