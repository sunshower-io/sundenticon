package io.sunshower.aidenticon.svg;

public interface DocumentWriter {

  void beginElement(String name);

  void endElement(String name);
}
