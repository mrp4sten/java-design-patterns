package com.mrp4sten.design.patterns.singleton;

public class SingletonExample {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      BDSingletonConection bdSingletonConection = BDSingletonConection.instance();
      System.out.println("Connectionn: " + bdSingletonConection);
    }
  }
}