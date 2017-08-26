package com.excitinglab.chatbot.kakao.service;

import com.excitinglab.chatbot.kakao.model.Keyboard;
import spark.Request;
import spark.Response;

import static spark.Spark.get;

public class KeyboardService {

  public KeyboardService() {
    get("/keyboard", this::getResponse);
  }

  public String getResponse(Request req, Response res) {
    String[] menus = {"menu1", "menu2"};
    return new Keyboard("menu", menus).toString();
  }

}
