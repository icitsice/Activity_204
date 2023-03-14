import java.util.Scanner;

public class answer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        game123 display = new game123();

        display.display();
        System.out.print("player 1: ");
        int player1 = input.nextInt();
        System.out.print("player 2: ");
        int player2 = input.nextInt();
        game123.play( player1,  player2);



    }
}
            class game123 {

                public void display() {
                    System.out.println("ROCK, PAPER, SCISSOR");
                    System.out.println("[1] ROCK");
                    System.out.println("[2] PAPER");
                    System.out.println("[3] SCISSOR");
                }

                public static int play(int player1, int player2) {


                    if (player1 == 0 && player2 == 1) {
                        System.out.println(" player1 is lose ");
                        System.out.println("player2 is win!");
                    } else if (player1 == 1 && player2 == 0) {
                        System.out.println("player2 is lose ");
                        System.out.println("player1 is win!");
                    } else if (player1 == 1 && player2 == 2) {
                        System.out.println(" player1 is lose ");
                        System.out.println("player2 is win!");
                    } else if (player1 == 2 && player2 == 1) {
                        System.out.println(" player2 lose ");
                        System.out.println("player1 is win!");
                    } else if (player1 == 0 && player2 == 2) {
                        System.out.println("player2 lose ");
                        System.out.println("player1 is win!");
                    } else if (player1 == 2 && player2 == 0) {
                        System.out.println("player1 lose ");
                        System.out.println("player2 is win!");
                    } else if (player1 == player2) {
                        System.out.println("draw");
                    } return 0;

                }}