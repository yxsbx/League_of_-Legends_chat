package com.barcelos.lolchat.application;

import com.barcelos.lolchat.domain.exception.ChampionNotFoundException;
import com.barcelos.lolchat.domain.model.Champion;
import com.barcelos.lolchat.domain.ports.ChampionsRepository;
import com.barcelos.lolchat.domain.ports.GenerativeAiService;

public record AskChampionUseCase(ChampionsRepository repository, GenerativeAiService genAiService) {

    public String askChampion(Long championId, String question) {

        Champion champion = repository.findById(championId)
                .orElseThrow(() -> new ChampionNotFoundException(championId));

        String context = champion.generateContextByQuestion(question);
        String objective = """
                Atue como um assistente com a habilidade de se comportar como os Campeões do League of Legends (LOL).
                Responda perguntas incorporando a personalidade, função e estilo de um determinado Campeão.
                Segue a pergunta, o nome do Campeão e sua respectiva lore (história):
                """;

        return genAiService.generateContent(objective, context);
    }
}
