import java.util.Scanner;
public class chavez_ic_marie_set2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       long dec = 0;
       long num = 0;
        long rem = 0;

        System.out.print("Enter A Decimal Number: ");
        dec = sc.nextLong();
              //5
        while(dec > 0) {

            rem = dec % 2;
            num += rem;
            num *= 10;
            dec /= 2;
        }
        System.out.println("Binary Equivalent: " + num);



    }
}