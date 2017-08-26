package com.excitinglab.chatbot.engine;

import com.excitinglab.chatbot.kakao.service.ChatRoomService;
import com.excitinglab.chatbot.kakao.service.FriendService;
import com.excitinglab.chatbot.kakao.service.KeyboardService;
import com.excitinglab.chatbot.kakao.service.MessageService;

import static spark.Spark.port;

public class ChatbotEngineContext {

  private final ChatbotEngineConfig config;

  private final KeyboardService keyboardService;

  private final MessageService messageService;

  private final ChatRoomService chatRoomService;

  private final FriendService friendService;

  public ChatbotEngineContext(ChatbotEngineConfig config) {
    this.config = config;

    port(config.getHttpPort());

    this.keyboardService = new KeyboardService();
    this.messageService = new MessageService();
    this.chatRoomService = new ChatRoomService();
    this.friendService = new FriendService();
  }

}
