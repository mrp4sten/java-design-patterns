package com.mrp4sten.design.patterns.composite;

public class CompositeExample {
  public static void main(String[] args) {
    Directory documents = new Directory("Documents");
    documents.addComponent(new File("TimeSheet.pdf"));
    documents.addComponent(new File("MoneyManagement.pdf"));

    Directory desktop = new Directory("Desktop");

    desktop.addComponent(new File("Java.doc"));
    desktop.addComponent(new File("Linux.doc"));
    desktop.addComponent(new File("Git.doc"));

    Directory backend = new Directory("Backend");
    backend.addComponent(new File("Networking.pdf"));
    backend.addComponent(new File("DesignPatterns.pdf"));
    backend.addComponent(new File("ThreadsAndConcurrence.pdf"));

    desktop.addComponent(backend);

    System.out.println(documents.display(0));
    System.out.println(desktop.display(0));

  }
}
