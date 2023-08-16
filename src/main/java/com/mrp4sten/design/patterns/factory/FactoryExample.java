package com.mrp4sten.design.patterns.factory;

public class FactoryExample {
  public static void main(String[] args) {
    BurguerFactory generalFactory = new Kitchen();

    Burguer burguer = generalFactory.burguerOrder("Cheese");
    System.out.println("Order for Mauricio Paste: " + burguer.getName());
    burguer = generalFactory.burguerOrder("Whopper");
    System.out.println("Order for Ragnar Lodrok: " + burguer.getName());

  }
}
