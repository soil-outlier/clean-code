package com.example.cleancode.v2.marshaler;


import com.example.cleancode.v2.ArgumentMarshaler;

public class StringArgumentMarshaler extends ArgumentMarshaler {
  private String stringValue = "";

  public void set(String s){
    stringValue = s;
  }

  public Object get() {
    return stringValue;
  }
}
