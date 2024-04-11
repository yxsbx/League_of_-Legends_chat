package com.barcelos.lolchat.adapters.in;

import com.barcelos.lolchat.application.ListChampionsUseCase;
import com.barcelos.lolchat.domain.model.Champion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/champions")
public record ListChampionsRestController(ListChampionsUseCase useCase) {

    @GetMapping
    public List<Champion> findAllChampions() {
        return useCase.findAll();
    }
}
