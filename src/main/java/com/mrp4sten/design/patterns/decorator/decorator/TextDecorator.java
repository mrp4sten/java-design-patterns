package com.mrp4sten.design.patterns.decorator.decorator;

import com.mrp4sten.design.patterns.decorator.Formattable;

public abstract class TextDecorator implements Formattable {
  protected Formattable text;

  protected TextDecorator(Formattable text) {
    this.text = text;
  }
}
