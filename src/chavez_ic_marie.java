import java.util.Scanner;
public class chavez_ic_marie {
    public static void main(String[] args) {
/*Write a program that accepts prelim, midterm, semi-final, and final grades as user input.
It will then compute the general weighted average (GWA),
based on 40% of the final period and 20% of each of the remaining periods.
Format the GWA result in two (2) decimal places and in a descriptive manner.
 */
        float prelim;
        float midterm;
        float semi_final;
        float final_grades;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Prelim: ");
        prelim = sc.nextFloat();
        System.out.println("Enter midterm: ");
        midterm = sc.nextFloat();
        System.out.println("Enter semi_final: ");
        semi_final = sc.nextFloat();
        System.out.println("Enter final grades: ");
        final_grades = sc.nextFloat();
        float result = prelim + midterm;
       float result2 = semi_final + final_grades;
       float  GWA1 = result2 + result ;
        float GWA = (float)0.1 / GWA1;
        System.out.println("GWA: "+ GWA);

    }
}