package com.excitinglab.kakaobot.service;

import spark.Request;
import spark.Response;

import static spark.Spark.delete;
import static spark.Spark.post;

/**
 * Created by comchangs on 2017. 7. 1..
 */
public class ChatRoomService {
  public ChatRoomService() {
    delete("/chat_room/:user_key", this::deleteResponse);
  }

  public String deleteResponse(Request req, Response res) {
    String userKey = req.params("user_key");
    return "delete" + userKey;
  }
}
