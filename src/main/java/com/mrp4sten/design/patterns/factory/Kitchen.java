package com.mrp4sten.design.patterns.factory;

public class Kitchen extends BurguerFactory {

  @Override
  Burguer makeBurguer(String type) {
    Burguer burguer = null;
    switch (type) {
      case "Whopper":
        burguer = new BurguerKingWhopper();
        break;

      case "Cheese":
        burguer = new CarlsJrCheeseburger();
        break;

      default:
        burguer = new BurguerKingWhopper();
        break;
    }

    return burguer;
  }

}
