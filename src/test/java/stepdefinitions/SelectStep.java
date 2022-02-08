package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.CarritoTask;
import task.SelectTask;
import ui.SelectUi;

public class SelectStep {
	
	@Before
	public void setUp() {
		
		OnStage.setTheStage(new OnlineCast());
				
	}
	

    @Given("^el usuario abre la pagina web$")
    public void el_usuario_abre_la_pagina_web()  {
    	
    	theActorCalled("usuario").attemptsTo(Open.url("http://practice.automationtesting.in/shop/"));
        
    }

    
    @When("^el usuario agrega libros$")
    public void el_usuario_agrega_libros()  {
    	
    	theActorCalled("usuario").attemptsTo(SelectTask.select());
        
    }

    @Then("^el usuario va al carrito de compras$")
    public void el_usuario_va_al_carrito_de_compras()  {
    	
    	theActorCalled("usuario").attemptsTo(CarritoTask.Carrito());
      
    }
    

}