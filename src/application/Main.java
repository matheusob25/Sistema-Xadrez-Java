package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch CM = new ChessMatch();
        while (true){
            UI.printBoard(CM.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);
            ChessPiece capturedPiece = CM.performChessMove(source, target);
        }







    }
}