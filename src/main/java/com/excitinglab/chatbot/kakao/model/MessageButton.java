package com.excitinglab.chatbot.kakao.model;

public class MessageButton {

  private final String label;

  private final String url;

  public MessageButton(String label, String url) {
    this.label = label;
    this.url = url;
  }

  public String getLabel() {
    return label;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("MessageButton{");
    sb.append("label='").append(label).append('\'');
    sb.append(", url='").append(url).append('\'');
    sb.append('}');
    return sb.toString();
  }

}
