package com.barcelos.lolchat.application;

import com.barcelos.lolchat.domain.model.Champion;
import com.barcelos.lolchat.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionsRepository repository) {

    public List<Champion> findAll() {
        return repository.findAll();
    }

}
