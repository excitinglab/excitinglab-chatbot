package com.excitinglab.chatbot.server;

import com.excitinglab.chatbot.util.PropertyUtils;

import java.io.IOException;
import java.nio.file.Path;

public class ChatbotServerConfig {

  private int httpPort;

  private Path log4jFilePath;

  public ChatbotServerConfig(Path propertyFilePath) throws IOException {
    setHttpPort(PropertyUtils.getInt(propertyFilePath, "excitinglab.chatbot.server.http.port"));
    setLog4jFilePath(PropertyUtils.getPath(propertyFilePath, "excitinglab.chatbot.server.log4j.file"));
  }

  public int getHttpPort() {
    return httpPort;
  }

  public ChatbotServerConfig setHttpPort(int httpPort) {
    this.httpPort = httpPort;
    return this;
  }

  public Path getLog4jFilePath() {
    return log4jFilePath;
  }

  public ChatbotServerConfig setLog4jFilePath(Path log4jFilePath) {
    this.log4jFilePath = log4jFilePath;
    return this;
  }
}
