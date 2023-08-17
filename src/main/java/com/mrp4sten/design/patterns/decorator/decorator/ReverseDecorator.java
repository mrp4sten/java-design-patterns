package com.mrp4sten.design.patterns.decorator.decorator;

import com.mrp4sten.design.patterns.decorator.Formattable;

public class ReverseDecorator extends TextDecorator {

  public ReverseDecorator(Formattable text) {
    super(text);
  }

  @Override
  public String makeFormat() {
    StringBuilder sb = new StringBuilder(text.makeFormat());
    return sb.reverse().toString();
  }

}
