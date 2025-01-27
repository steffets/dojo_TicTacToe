package de.dojo.tictactoe.service;

import org.springframework.stereotype.Service;

@Service
public class GameService {

    public boolean makeTurn(int[][] field, int player, int x, int y) {
        if (field[x][y] != 0) {
            return false;
        }
        field[x][y] = player;
        return true;
    }

    public boolean checkWin(int[][] field, int player) {
        if (
                field[0][0] == player && field[1][0] == player && field[2][0] == player) {
            return true;
        } else  if (
                field[0][1] == player && field[1][1] == player && field[2][1] == player) {
            return true;
        } else  if (
                field[0][2] == player && field[1][2] == player && field[2][2] == player) {
            return true;
        } else if ( // waagrecht
                field[0][0] == player && field[0][1] == player && field[0][2] == player) {
            return true;
        } else  if (
                field[1][0] == player && field[1][1] == player && field[1][2] == player) {
            return true;
        } else  if (
                field[2][0] == player && field[2][1] == player && field[2][2] == player) {
            return true;
        } else  if ( // diagonal
                field[0][0] == player && field[1][1] == player && field[2][2] == player) {
            return true;
        } else  if ( // diagonal
                field[0][2] == player && field[1][1] == player && field[2][0] == player) {
            return true;
        }
        return false;
    }
}
