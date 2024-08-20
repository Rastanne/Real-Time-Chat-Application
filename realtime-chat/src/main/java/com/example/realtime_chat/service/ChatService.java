package com.example.realtimechat.service;

import com.example.realtimechat.model.ChatMessage;
import com.example.realtimechat.repository.ChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    @Autowired
    private ChatMessageRepository chatMessageRepository;

    public ChatMessage save(ChatMessage chatMessage) {
        return chatMessageRepository.save(chatMessage);
    }
}
