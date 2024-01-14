package application;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch CM = new ChessMatch();
        while (true) {
            try {
                UI.clearScreen();
                UI.printMatch(CM);
                System.out.println();
                System.out.println("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = CM.possibleMoves(source);
                UI.printBoard(CM.getPieces(), possibleMoves);

                System.out.println("Target: ");
                ChessPosition target = UI.readChessPosition(sc);
                ChessPiece capturedPiece = CM.performChessMove(source, target);
            } catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }



    }
}