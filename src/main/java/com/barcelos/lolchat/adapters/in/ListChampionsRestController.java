package com.barcelos.lolchat.adapters.in;

import com.barcelos.lolchat.application.ListChampionsUseCase;
import com.barcelos.lolchat.domain.model.Champion;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Champions", description = "LOL Champions domain endpoints.")
@RestController
@RequestMapping("/champions")
public record ListChampionsRestController(ListChampionsUseCase useCase) {

    @CrossOrigin
    @GetMapping
    public List<Champion> findAllChampions() {
        return useCase.findAll();
    }
}
