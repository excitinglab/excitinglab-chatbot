package com.excitinglab.kakaobot.service;

import com.excitinglab.kakaobot.model.Keyboard;
import spark.Request;
import spark.Response;

import static spark.Spark.get;

/**
 * Created by comchangs on 2017. 7. 1..
 */
public class KeyboardService
{
  public KeyboardService() {
    get("/keyboard", this::getResponse);
  }

  public String getResponse(Request req, Response res) {
    String[] menus = {"menu1", "menu2"};
    return new Keyboard("menu", menus).toString();
  }
}
