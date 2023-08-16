package com.mrp4sten.design.patterns.factory;

public class BurguerKingWhopper extends Burguer {

  public BurguerKingWhopper() {
    super();
    name = "Whopper";
    meat = "Beef";
    cheese = "American";
    seasonings.add("Lettuce");
    seasonings.add("Ketchup");
    seasonings.add("Mustard");
    seasonings.add("Mayonnaise");

  }

  @Override
  public void cooking() {
    System.out.println("Making Whopper from Burguer King");
  }

}
