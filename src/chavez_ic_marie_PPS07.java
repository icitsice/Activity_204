import java.util.Scanner;
public class chavez_ic_marie_PPS07 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num1;
       int num2;
       int operation = 0;
        System.out.println("MENU");
        System.out.println("1. Multiplication");
        System.out.println("2. Division");
        System.out.println("3. Exit");

       System.out.println("\nEnter your choice: ");

        operation= sc.nextInt();
        while(operation!=3) {

            switch (operation) {

                case 1:
                    System.out.println("Enter num1: ");
                    num1 = sc.nextInt();
                    System.out.println("Enter num2: ");
                    num2 = sc.nextInt();
                    for (int i = 0; i < num2; i++) {
                        num1 += num2;
                    }
                    System.out.println("Result" + num1 );
                    break;
                case 2:

                    System.out.println("Enter num1: ");
                    num1 = sc.nextInt();
                    System.out.println("Enter num2: ");
                    num2 = sc.nextInt();
                    int result = 0;
                    while (num1 >= num2) {
                        num1 -= num2;
                        result++;

                    }
                    System.out.println("Result:" + num2);
                    break;
                case 3:
                    System.out.println("That's all folks!");
                    break;

            }

        }

    }
}
