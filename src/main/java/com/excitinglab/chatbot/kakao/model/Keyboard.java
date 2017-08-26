package com.excitinglab.chatbot.kakao.model;

import java.util.Arrays;

public class Keyboard {

  private final String type;

  private final String[] buttons;

  public Keyboard(String type, String[] buttons) {
    this.type = type;
    this.buttons = buttons;
  }

  public String getType() {
    return type;
  }

  public String[] getButtons() {
    return buttons;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Keyboard{");
    sb.append("type='").append(type).append('\'');
    sb.append(", buttons=").append(buttons == null ? "null" : Arrays.asList(buttons).toString());
    sb.append('}');
    return sb.toString();
  }
}
