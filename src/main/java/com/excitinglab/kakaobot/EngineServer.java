package com.excitinglab.kakaobot;

import com.excitinglab.kakaobot.service.ChatRoomService;
import com.excitinglab.kakaobot.service.FriendService;
import com.excitinglab.kakaobot.service.KeyboardService;
import com.excitinglab.kakaobot.service.MessageService;

public class EngineServer {
  public static void main(String[] args) {

    KeyboardService keyboardService = new KeyboardService();
    MessageService messageService = new MessageService();
    ChatRoomService chatRoomService = new ChatRoomService();
    FriendService friendService = new FriendService();

  }
}