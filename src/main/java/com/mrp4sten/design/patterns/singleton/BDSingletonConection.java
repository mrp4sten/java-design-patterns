package com.mrp4sten.design.patterns.singleton;

public class BDSingletonConection {

  private static BDSingletonConection instance;

  private BDSingletonConection() {
    System.out.println("Connection to some one BD");
  }

  public static BDSingletonConection instance() {
    if (instance == null) {
      instance = new BDSingletonConection();
    }

    return instance;
  }
}
