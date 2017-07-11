package com.excitinglab.kakaobot.service;

import com.excitinglab.kakaobot.model.Keyboard;
import spark.Request;
import spark.Response;

import static spark.Spark.delete;
import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by comchangs on 2017. 7. 1..
 */
public class FriendService {
  public FriendService() {
    post("/friend", this::postResponse);
    delete("/friend", this::deleteResponse);
  }

  public String postResponse(Request req, Response res) {
    String userKey = req.params("user_key");
    return "post" + userKey;
  }

  public String deleteResponse(Request req, Response res) {
    String userKey = req.params("user_key");
    return "delete" + userKey;
  }
}
