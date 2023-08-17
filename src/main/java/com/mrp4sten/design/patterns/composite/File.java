package com.mrp4sten.design.patterns.composite;

import java.util.Collections;

public class File extends Component {

  public File(String name) {
    super(name);
  }

  @Override
  public String display(int level) {
    return String.join("", Collections.nCopies(level, "\t")) + name;
  }

}
