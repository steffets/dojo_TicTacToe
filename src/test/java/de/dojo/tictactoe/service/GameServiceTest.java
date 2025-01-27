package de.dojo.tictactoe.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {

    private GameService gameService = new GameService();

    @Test
    void makeTurnOnFreeField() {
        // given - row/column etc.

        // when;
        gameService.makeTurn();

        // then - Assertions.assertThat()

    }

}