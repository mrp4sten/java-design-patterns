package com.mrp4sten.design.patterns.factory;

public abstract class BurguerFactory {
  public Burguer burguerOrder(String type) {
    Burguer burguer = makeBurguer(type);
    System.out.println("------- Making Burguer " + burguer.getName() + "-------");
    burguer.prepare();
    burguer.cooking();
    burguer.givingOut();
    return burguer;
  }

  abstract Burguer makeBurguer(String type);

}
