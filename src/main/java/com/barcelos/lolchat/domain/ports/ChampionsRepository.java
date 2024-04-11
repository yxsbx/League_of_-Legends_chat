package com.barcelos.lolchat.domain.ports;

import com.barcelos.lolchat.domain.model.Champion;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {

    List<Champion> findAll();

    Optional<Champion> findById(Long id);
}
