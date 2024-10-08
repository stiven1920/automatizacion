package com.example.steps;

import org.fluentlenium.core.annotation.Page;

import com.example.demo.InicioPage;

import net.thucydides.core.annotations.Step;

public class InicioStep {
	
	@Page
	public InicioPage pageInicio;
	
	@Step("Abir el navegador")
	public void openPage() {
		 pageInicio.openUrl("https://sanangel.com.co/");		
	}
	
	@Step("Seleccionar la primera flor")
	public void seleccionFlores() {
	pageInicio.getDriver().findElement(pageInicio.getPrimereFlor()).click();
	}
	
	
	
}
