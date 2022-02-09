
Feature: reto prueba banistmo

  @Prueba
  Scenario Outline: Automatizacion prueba
    Given el usuario abre la pagina web
    When  el usuario agrega libros
    And   el usuario va al carrito de compras
    And 	el usuario borra libro
    Then  el usuario valida el total 

