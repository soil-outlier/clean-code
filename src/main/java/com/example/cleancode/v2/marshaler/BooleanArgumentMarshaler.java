package com.example.cleancode.v2.marshaler;


import com.example.cleancode.v2.ArgumentMarshaler;

public class BooleanArgumentMarshaler extends ArgumentMarshaler {
  private boolean booleanValue = false;

  public void set(String s){
    booleanValue = true;
  }

  public Object get() {
    return booleanValue;
  }
}
