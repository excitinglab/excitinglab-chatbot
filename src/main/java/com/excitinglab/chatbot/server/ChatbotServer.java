package com.excitinglab.chatbot.server;

import java.nio.file.Paths;

public class ChatbotServer {

  public ChatbotServer(String[] args) throws Exception {
    ChatbotServerConfig config = new ChatbotServerConfig(args.length > 0 ? Paths.get(args[0]) : Paths.get("conf/server.properties"));
    ChatbotServerContext context = new ChatbotServerContext(config);
  }

  public static void main(String[] args) throws Exception {
    ChatbotServer server = new ChatbotServer(args);
  }

}