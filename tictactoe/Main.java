package tictactoe;

public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        System.out.println("game winner is " + game.startGame());
    }
}
