package com.mrp4sten.design.patterns.decorator.decorator;

import com.mrp4sten.design.patterns.decorator.Formattable;

public class CapitalLettersTextDecorator extends TextDecorator {

  public CapitalLettersTextDecorator(Formattable text) {
    super(text);
  }

  @Override
  public String makeFormat() {
    return text.makeFormat().toUpperCase();
  }

}
