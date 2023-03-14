/* a program that processes the addition of two (2) declared numbers.
The result will then be subtracted by half of the value of the 1st declared number,
which will then be multiplied by half of the value of the 1st declared number,
and so on for division, and modulo.*/
public class chavez_ic_marie_PPS03_1 {
    public static void main(String[] args)
    {
        int num1 = 5;
        int num2 = num1 + 4;
        int sum = num1 + num2;
        double total = num1 - 2.5;
        double substraction = total + num2;
        double multiplication = total * substraction;
        double division = multiplication / total;
        double modulo = num1 % num2;

                System.out.println("1st number: " + num1);
                System.out.println("2nd number: " + num2);
                System.out.println("ADDITION: " + sum);
                System.out.println( "SUBSTRACTION: " + substraction);
                System.out.println( "MULTIPLICATION: " + multiplication);
                System.out.println( "DIVISION: " + division);
                System.out.println( "MODULO: " + modulo);

    }
}
