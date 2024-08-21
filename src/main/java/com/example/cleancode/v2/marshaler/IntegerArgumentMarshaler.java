package com.example.cleancode.v2.marshaler;


import com.example.cleancode.v2.ArgsException;
import com.example.cleancode.v2.ArgumentMarshaler;

public class IntegerArgumentMarshaler extends ArgumentMarshaler {
  private int intValue = 0;

  public void set(String s){
    intValue = Integer.parseInt(s);
  }

  public Object get() {
    return intValue;
  }
}
