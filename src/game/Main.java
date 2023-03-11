package game;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Player player1 = new Player("Rahul", 1000, 10);
        Player player2 = new Player("Jatin", 1500, 12);

        System.out.println("Player 1: " + player1.getName() + " Score: " + player1.getScore() + " Level: " + player1.getLevel());
        System.out.println("Player 2: " + player2.getName() + " Score: " + player2.getScore() + " Level: " + player2.getLevel());

        player1.setName("Jack");
        player2.setScore(2000);
        player2.setLevel(15);

        System.out.println("Player 1: " + player1.getName() + " Score: " + player1.getScore() + " Level: " + player1.getLevel());
        System.out.println("Player 2: " + player2.getName() + " Score: " + player2.getScore() + " Level: " + player2.getLevel());
    }
}
