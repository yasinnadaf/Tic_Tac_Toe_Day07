package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {

    static char[] board = new char[10];
    static Scanner scr = new Scanner(System.in);
    static char playerLetter;
    static char computerLetter;

    static void createBoard(char[] board) {
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
    }

    static void getLetter() {
        System.out.println("Choose your letter(X or O)");
        playerLetter = scr.next().toUpperCase().charAt(0);
        computerLetter = (playerLetter == 'X') ? 'O' : 'X';
        System.out.println("your letter is: " + playerLetter);
        System.out.println("computer letter is: " + computerLetter);
    }
    static void showBoard(char[] board){
        System.out.println(board[1]+"|"+board[2]+"|"+board[3]);
        System.out.println(board[4]+"|"+board[5]+"|"+board[6]);
        System.out.println((board[7]+"|"+board[7]+"|"+board[9]));
    }

    static void makeMove(int position, char currentPlayerLetter, char[] board) {

        switch (position) {
            case 1:
                if (board[1] == ' ')
                    board[1] = currentPlayerLetter;
                break;
            case 2:
                if (board[2] == ' ')
                    board[2] = currentPlayerLetter;
                break;
            case 3:
                if (board[3] == ' ')
                    board[3] = currentPlayerLetter;
                break;
            case 4:
                if (board[4] == ' ')
                    board[4] = currentPlayerLetter;
                break;
            case 5:
                if (board[5] == ' ')
                    board[5] = currentPlayerLetter;
                break;
            case 6:
                if (board[6] == ' ')
                    board[6] = currentPlayerLetter;
                break;
            case 7:
                if (board[7] == ' ')
                    board[7] = currentPlayerLetter;
                break;
            case 8:
                if (board[8] == ' ')
                    board[8] = currentPlayerLetter;
                break;
            case 9:
                if (board[9] == ' ')
                    board[9] = currentPlayerLetter;
                break;
            default:
                break;

        }
    }

    public static void main(String[] args) {
        System.out.println("*** Welcome to TicTacToe Game ***");
        createBoard(board);
        getLetter();
        showBoard(board);
        makeMove(3,playerLetter, board);
        showBoard(board);
    }
}