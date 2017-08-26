package com.excitinglab.chatbot.kakao.service;

import com.excitinglab.chatbot.kakao.model.Message;
import spark.Request;
import spark.Response;

import static spark.Spark.get;

public class MessageService {

  public MessageService() {
    get("/message", this::getResponse);
  }

  public String getResponse(Request req, Response res) {
    String userKey = req.params("user_key");
    String type = req.params("type");
    String content = req.params("content");
    return new Message(userKey + type + content).toString();
  }

}
