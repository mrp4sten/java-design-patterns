package com.mrp4sten.design.patterns.observer;

public class ObserverExample {
  public static void main(String[] args) {
    Corporation corporation = new Corporation("Bitcoin", 1000);
    corporation.addObserver(observable -> {
      System.out.println("Mauricio: " + ((Corporation) observable).getName() +
          "New price: $" +
          ((Corporation) observable).getPrice());
    });

    corporation.addObserver(observable -> {
      System.out.println("Mickey: " + ((Corporation) observable).getName() +
          "New price: $" +
          ((Corporation) observable).getPrice());
    });

    corporation.addObserver(observable -> {
      System.out.println("Leon: " + ((Corporation) observable).getName() +
          "New price: $" +
          ((Corporation) observable).getPrice());
    });

    corporation.modifyPrice(500);
  }
}
