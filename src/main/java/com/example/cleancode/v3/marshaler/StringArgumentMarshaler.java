package com.example.cleancode.v3.marshaler;


import static com.example.cleancode.v3.ArgsException.ErrorCode.*;

import com.example.cleancode.v3.ArgsException;
import com.example.cleancode.v3.ArgumentMarshaler;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringArgumentMarshaler implements ArgumentMarshaler {
  private String stringValue = "";


  public static String getValue(ArgumentMarshaler am) {
    if (am != null && am instanceof StringArgumentMarshaler)
      return ((StringArgumentMarshaler) am).stringValue;
    else
      return "";
  }

  @Override
  public void set(Iterator<String> currentArgument) throws ArgsException {
    try {
      stringValue = currentArgument.next();
    } catch (NoSuchElementException e) {
      throw new ArgsException(MISSING_STRING);
    }
  }
}