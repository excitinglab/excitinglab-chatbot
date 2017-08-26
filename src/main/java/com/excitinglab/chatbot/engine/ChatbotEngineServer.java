package com.excitinglab.chatbot.engine;

import java.nio.file.Paths;

public class ChatbotEngineServer {

  private final ChatbotEngineContext engineContext;

  private final ChatbotEngineConfig config;

  public ChatbotEngineServer(String[] args) throws Exception {
    this.config = new ChatbotEngineConfig(Paths.get("conf/server.properties"));
    this.engineContext = new ChatbotEngineContext(config);
  }


  public static void main(String[] args) throws Exception {
    ChatbotEngineServer chatbotEngineServer = new ChatbotEngineServer(args);
  }

}