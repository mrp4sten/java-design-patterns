package com.mrp4sten.design.patterns.decorator;

public class Text implements Formattable {

  private String text;

  public String getText() {
    return text;
  }

  public Text(String text) {
    this.text = text;
  }

  @Override
  public String makeFormat() {
    return getText();
  }

}
