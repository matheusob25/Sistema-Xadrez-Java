package application;

import chess.ChessMatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch CM = new ChessMatch();
        UI.printBoard(CM.getPieces());


        sc.close();
    }
}