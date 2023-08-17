package com.mrp4sten.design.patterns.decorator;

import com.mrp4sten.design.patterns.decorator.decorator.CapitalLettersTextDecorator;
import com.mrp4sten.design.patterns.decorator.decorator.ReplaceSpaceDecorator;
import com.mrp4sten.design.patterns.decorator.decorator.ReverseDecorator;

public class ExampleDecorator {
  public static void main(String[] args) {
    Formattable formattable = new Text("Hellow there!");
    CapitalLettersTextDecorator capitalLettersTextDecorator = new CapitalLettersTextDecorator(formattable);
    ReverseDecorator reverseDecorator = new ReverseDecorator(capitalLettersTextDecorator);
    ReplaceSpaceDecorator replaceSpaceDecorator = new ReplaceSpaceDecorator(reverseDecorator);
    System.out.println(replaceSpaceDecorator.makeFormat());
  }
}
