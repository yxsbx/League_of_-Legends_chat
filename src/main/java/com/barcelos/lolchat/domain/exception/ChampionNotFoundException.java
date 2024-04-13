package com.barcelos.lolchat.domain.exception;

public class ChampionNotFoundException extends RuntimeException {

    public ChampionNotFoundException(Long championId) {
        super("Champion with ID %d not found.".formatted(championId));
    }
}
