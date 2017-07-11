package com.excitinglab.kakaobot.model;

/**
 * Created by comchangs on 2017. 7. 1..
 */
public class Message {
  private final String text;
  private final Photo photo;
  private final MessageButton message_button;

  public Message(String text) {
    this.text = text;
    this.photo = null;
    this.message_button = null;
  }

  public Message(String text, Photo photo, MessageButton message_button) {
    this.text = text;
    this.photo = photo;
    this.message_button = message_button;
  }

  public String getText() {
    return text;
  }

  public Photo getPhoto() {
    return photo;
  }

  public MessageButton getMessage_button() {
    return message_button;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Message{");
    sb.append("text='").append(text).append('\'');
    sb.append(", photo=").append(photo);
    sb.append(", message_button=").append(message_button);
    sb.append('}');
    return sb.toString();
  }
}
