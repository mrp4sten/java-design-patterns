package com.mrp4sten.design.patterns.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Directory extends Component {

  private List<Component> childs;

  public Directory(String name) {
    super(name);
    this.childs = new ArrayList<>();
  }

  public Directory addComponent(Component component) {
    childs.add(component);
    return this;
  }

  public void deleteComponent(Component component) {
    childs.remove(component);
  }

  @Override
  public String display(int level) {
    StringBuilder sb = new StringBuilder(String.join("", Collections.nCopies(level, "\t")));

    sb.append(name)
        .append("/")
        .append("\n");

    for (Component component : this.childs) {
      sb.append(component.display(level + 1));
      if (component instanceof File) {
        sb.append("\n");
      }
    }
    return sb.toString();
  }

}
