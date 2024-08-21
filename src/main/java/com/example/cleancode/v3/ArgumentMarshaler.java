package com.example.cleancode.v3;

import java.util.Iterator;

public interface  ArgumentMarshaler {
  void set(Iterator<String> currentArgument) throws ArgsException;
}
