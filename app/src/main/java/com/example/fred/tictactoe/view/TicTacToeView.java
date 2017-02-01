package com.example.fred.tictactoe.view;

/**
 * Created by fred on 01/02/17.
 */

public interface TicTacToeView {
    void showWinner(String winningPlayerDisplayLabel);
    void clearWinnerDisplay();
    void clearButtons();
    void setButtonText(int row, int col, String label);
}
