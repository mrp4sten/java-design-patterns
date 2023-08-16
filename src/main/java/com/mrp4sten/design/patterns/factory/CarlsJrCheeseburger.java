package com.mrp4sten.design.patterns.factory;

public class CarlsJrCheeseburger extends Burguer {

  public CarlsJrCheeseburger() {
    super();
    name = "Bacon Chesse Burguer";
    meat = "Beef";
    cheese = "American";
    seasonings.add("Bacon");
    seasonings.add("Onion");
    seasonings.add("Pickles");
    seasonings.add("More American Cheese");
    seasonings.add("Dressing");
  }

  @Override
  public void cooking() {
    System.out.println("Making Cheese Burguer from Carls Jr.");
  }

}
