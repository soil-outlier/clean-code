package com.example.cleancode.v3.marshaler;


import static com.example.cleancode.v3.ArgsException.ErrorCode.INVALID_INTEGER;
import static com.example.cleancode.v3.ArgsException.ErrorCode.MISSING_INTEGER;

import com.example.cleancode.v3.ArgsException;
import com.example.cleancode.v3.ArgumentMarshaler;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntegerArgumentMarshaler implements ArgumentMarshaler {
  private int intValue = 0;

  public static int getValue(ArgumentMarshaler am) {
    if (am != null && am instanceof IntegerArgumentMarshaler)
      return ((IntegerArgumentMarshaler) am).intValue;
    else
      return 0;
  }

  @Override
  public void set(Iterator<String> currentArgument) throws ArgsException {
    String parameter = null;
    try {
      parameter = currentArgument.next();
      intValue = Integer.parseInt(parameter);
    } catch (NoSuchElementException e) {
      throw new ArgsException(MISSING_INTEGER);
    } catch (NumberFormatException e) {
      throw new ArgsException(INVALID_INTEGER, parameter);
    }
  }
}
