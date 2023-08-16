package com.mrp4sten.design.patterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Burguer {
  protected String name;
  protected String meat;
  protected String cheese;
  protected List<String> seasonings;

  public Burguer() {
    this.seasonings = new ArrayList<>();
  }

  public void prepare() {
    System.out.println("Cooking: " + name);
    System.out.println("meat: " + meat);
    System.out.println("cheese: " + cheese);
    System.out.println("Seasonings: ");
    this.seasonings.forEach(System.out::println);
  }

  abstract public void cooking();

  public void givingOut() {
    System.out.println("Giving out: " + name);
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "{" +
        " name='" + name + "'" +
        ", meat='" + meat + "'" +
        ", cheese='" + cheese + "'" +
        ", seasonings='" + seasonings + "'" +
        "}";
  }

}
