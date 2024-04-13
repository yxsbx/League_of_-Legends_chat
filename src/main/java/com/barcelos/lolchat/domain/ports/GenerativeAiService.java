package com.barcelos.lolchat.domain.ports;

public interface GenerativeAiService {

    String generateContent(String objective, String context);
}
