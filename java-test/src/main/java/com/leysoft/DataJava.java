package com.leysoft;

public class DataJava {

  private String value;

  public DataJava(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "DataJava{" + "value='" + value + '\'' + '}';
  }
}
