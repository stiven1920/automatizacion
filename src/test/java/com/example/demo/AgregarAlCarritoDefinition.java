package com.example.demo;

import com.example.steps.CarritoFloresStep;
import com.example.steps.InicioStep;

import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class AgregarAlCarritoDefinition {
	
	@Steps
	InicioStep inicioStep;
	
	@Steps
	CarritoFloresStep carritoFlores;
	
	@Dado("que el usuario seleccione una flor")
	public void usuarioSeleccionaFlor() {
		inicioStep.openPage();
		inicioStep.seleccionFlores();
	}
	
	@Cuando("Ingresa la cantidad de flores a comprar")
	public void cantidadFlores() {
		carritoFlores.selecionaCantidad();
		carritoFlores.agregandoAlCarrito();
	}
	
	@Entonces("Valida que este ya en la pagina de compra")
	public void validacionCompra() {
		carritoFlores.validacionCompra();
	}

}
