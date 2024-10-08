package com.example.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

import com.example.demo.CarritoFlores;

import net.thucydides.core.annotations.Step;

public class CarritoFloresStep {
	
	@Page
	CarritoFlores floresCarrito;
	
	
	@Step("Selecciona la cantidad")
	public void selecionaCantidad() {
		floresCarrito.getDriver().findElement(floresCarrito.getCantidadFlores()).clear();
		floresCarrito.getDriver().findElement(floresCarrito.getCantidadFlores()).sendKeys("2");
	}
	
	@Step("Selecciona el boton para agregar al carrito")
	public void agregandoAlCarrito() {
		floresCarrito.getDriver().findElement(floresCarrito.getBtnComprar()).click();
	}
	
	@Step("Valida que este en la pasgina de pagos")
	public void validacionCompra() {
		String textFinal = floresCarrito.getDriver().findElement(floresCarrito.getTextoFinalizar()).getAttribute("innetText");
		assertEquals("Finalizar compra", textFinal);
	}

}
