import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissor_Game {

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    String[] choices = {"Rock", "Paper", "Scissor"};

    public static void main(String[] args) {
        Rock_paper_scissor_Game gm = new Rock_paper_scissor_Game();
        gm.game();
    }

    public void game() {

        while (true) {

            System.out.println("\nChoose: 0 for Rock, 1 for Paper, 2 for Scissor");
            int guess = sc.nextInt();

            // Input validation
            if (guess < 0 || guess > 2) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            System.out.println("You choose: " + choices[guess]);

            int computer = rand.nextInt(3);
            System.out.println("Computer choose: " + choices[computer]);

            // Draw
            if (guess == computer) {
                System.out.println("It's a Draw!");
            }
            // Winning conditions
            else if ((guess == 0 && computer == 2) ||
                    (guess == 1 && computer == 0) ||
                    (guess == 2 && computer == 1)) {

                System.out.println("You Win! 🎉");
                break;
            }
            // Losing condition
            else {
                System.out.println("You Lose! ");
            }
        }
    }
}