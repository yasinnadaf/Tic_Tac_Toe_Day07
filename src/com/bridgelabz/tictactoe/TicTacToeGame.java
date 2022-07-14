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
        System.out.println("your letter is " + playerLetter);
        System.out.println("computer letter is: " + computerLetter);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game");
        createBoard(board);
        getLetter();

    }
}