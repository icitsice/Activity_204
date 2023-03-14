import java.util.Arrays;
import java.util.Scanner;
public class chavez_ic_marie_pps09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len;
        int[] num;

        System.out.print("Enter length of array: ");

        len = input.nextInt();

        num = new int[]{89, 24, 35, 25, 26};


        //   System.out.print("Array length: " + num.length);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            System.out.print("");

        }
        for (int i = 0; i < num.length; i++)
        { System.out.print("ARRAY: " + num[i] );

        }
        Arrays.sort(num);
        for (int i : num)
            System.out.print("SORTED: "+ i );
     }
}