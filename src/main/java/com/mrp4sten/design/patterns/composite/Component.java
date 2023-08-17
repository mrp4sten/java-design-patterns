package com.mrp4sten.design.patterns.composite;

import java.util.Objects;

public abstract class Component {
  protected String name;

  public String getName() {
    return name;
  }

  protected Component(String name) {
    this.name = name;
  }

  abstract String display(int level);

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Component other = (Component) obj;
    return Objects.equals(name, other.name);

  }

}
