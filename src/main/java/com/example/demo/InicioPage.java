package com.example.demo;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class InicioPage extends PageObject {
	private final By primereFlor = By.cssSelector("div.vc_tta-panel-body > div > ul > li:nth-child(1)");
	private final By segundaFlor = By.cssSelector("div.vc_tta-panel-body > div > ul > li:nth-child(3)");
	
	public By getPrimereFlor() {
		return primereFlor;
	}
	public By getSegundaFlor() {
		return segundaFlor;
	}
	
	
}
