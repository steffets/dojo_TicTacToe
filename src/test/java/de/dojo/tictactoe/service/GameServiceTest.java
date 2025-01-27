package de.dojo.tictactoe.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {

    private GameService gameService = new GameService();

    @Test
    void makeTurnOnFreeField() {
        // given - row/column etc.
        int[][] field = new int[3][3];
        // when;
        gameService.makeTurn(field, 1, 0, 0 );

        // then
        Assertions.assertThat(field[0][0]).isEqualTo(1);
    }

    @Test
    void makeTurnOnNotFreeField() {
        // given - row/column etc.
        int[][] field = new int[3][3];
        gameService.makeTurn(field, 1, 0, 0 );

        // when;
        boolean success = gameService.makeTurn(field, 1, 0, 0 );

        // then
        Assertions.assertThat(success).isFalse();
    }


    @Test
    void noWin() {
        // given - row/column etc.
        int[][] field = new int[3][3];

        // when;
        boolean win = gameService.checkWin(field, 1);

        // then
        Assertions.assertThat(win).isFalse();
    }

    @Test
    void win123() {
        // given - row/column etc.
        int[][] field = new int[3][3];
        gameService.makeTurn(field, 1, 0, 0 );
        gameService.makeTurn(field, 1, 1, 0 );
        gameService.makeTurn(field, 1, 2, 0 );

        // when;
        boolean win = gameService.checkWin(field, 1);

        // then
        Assertions.assertThat(win).isTrue();
    }

    @Test
    void win456() {
        // given - row/column etc.
        int[][] field = new int[3][3];
        gameService.makeTurn(field, 1, 0, 1 );
        gameService.makeTurn(field, 1, 1, 1 );
        gameService.makeTurn(field, 1, 2, 1 );

        // when;
        boolean win = gameService.checkWin(field, 1);

        // then
        Assertions.assertThat(win).isTrue();
    }

    @Test
    void win789() {
        // given - row/column etc.
        int[][] field = new int[3][3];
        gameService.makeTurn(field, 1, 0, 2 );
        gameService.makeTurn(field, 1, 1, 2 );
        gameService.makeTurn(field, 1, 2, 2 );

        // when;
        boolean win = gameService.checkWin(field, 1);

        // then
        Assertions.assertThat(win).isTrue();
    }

    @Test
    void win136() {
        // given - row/column etc.
        int[][] field = new int[3][3];
        gameService.makeTurn(field, 1, 0, 0 );
        gameService.makeTurn(field, 1, 0, 1 );
        gameService.makeTurn(field, 1, 0, 2 );

        // when;
        boolean win = gameService.checkWin(field, 1);

        // then
        Assertions.assertThat(win).isTrue();
    }

    @Test
    void win248() {
        // given - row/column etc.
        int[][] field = new int[3][3];
        gameService.makeTurn(field, 1, 1, 0 );
        gameService.makeTurn(field, 1, 1, 1 );
        gameService.makeTurn(field, 1, 1, 2 );

        // when;
        boolean win = gameService.checkWin(field, 1);

        // then
        Assertions.assertThat(win).isTrue();
    }

    @Test
    void win359() {
        // given - row/column etc.
        int[][] field = new int[3][3];
        gameService.makeTurn(field, 1, 2, 0 );
        gameService.makeTurn(field, 1, 2, 1 );
        gameService.makeTurn(field, 1, 2, 2 );

        // when;
        boolean win = gameService.checkWin(field, 1);

        // then
        Assertions.assertThat(win).isTrue();
    }

    @Test
    void win059() {
        // given - row/column etc.
        int[][] field = new int[3][3];
        gameService.makeTurn(field, 1, 0, 0 );
        gameService.makeTurn(field, 1, 1, 1 );
        gameService.makeTurn(field, 1, 2, 2 );

        // when;
        boolean win = gameService.checkWin(field, 1);

        // then
        Assertions.assertThat(win).isTrue();
    }
    @Test
    void win357() {
        // given - row/column etc.
        int[][] field = new int[3][3];
        gameService.makeTurn(field, 1, 2, 0 );
        gameService.makeTurn(field, 1, 1, 1 );
        gameService.makeTurn(field, 1, 0, 2 );

        // when;
        boolean win = gameService.checkWin(field, 1);

        // then
        Assertions.assertThat(win).isTrue();
    }


}