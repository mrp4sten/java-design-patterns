package com.mrp4sten.design.patterns.decorator.decorator;

import com.mrp4sten.design.patterns.decorator.Formattable;

public class ReplaceSpaceDecorator extends TextDecorator {

  public ReplaceSpaceDecorator(Formattable text) {
    super(text);
  }

  @Override
  public String makeFormat() {
    return text.makeFormat().replace(" ", "_");
  }

}
