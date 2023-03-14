import java.io.*;
public class chavez_ic_marie_PPS08 {
    public static void main(String[] args) {

        // Declaring and initializing variables
        int number = 7;

        int a, b;
        for (a = 1; a <= number; a++) {

            for (b = 1; b <= number - a; b++) {
                System.out.print(" ");
            }
            for (b = 1;  b<= a * 2 - 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (a = number - 1; a > 0; a--) {
            for (b = 1; b <= number - a; b++) {
                System.out.print(" ");
            }
            for (b = 1; b <= a * 2 - 1;b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}