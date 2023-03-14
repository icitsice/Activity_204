import javax.print.DocFlavor;
import java.util.Scanner;

public class chavez_ic_marie_pps10 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==============PAYSLIP==============\\");

        System.out.println("======EMPLOYEE INFORMATION=======");
        System.out.print("Employee Name: ");
        String Employee_Name = input.nextLine();
        System.out.print("Rendered Hours: ");
        int Rendered_Hours = input.nextInt();
        System.out.print("Rate per Hour: ");
        int RPH = input.nextInt();
        Payroll employee_info = new Payroll();


        System.out.println("=============DEDUCTIONS===========");
        System.out.print("SSS: ");
        int SSS = input.nextInt();
        System.out.print("PhilHealth: ");
       int  philhealth = input.nextInt();
        System.out.print("Loans: ");
        int loans = input.nextInt();
        System.out.print("Tax: ");
        int tax = input.nextInt();
       Payroll totalDeduct = new Payroll();
       Payroll.totalDeduct(SSS,philhealth,loans, tax );
        System.out.println("==========NET SALARY===============");
       Payroll grossSalary1 = new Payroll();
        Payroll.grossSalary1(Rendered_Hours, RPH);
        System.out.println("\n");

        Payroll Deduction = new Payroll();
        Payroll.Deduction(SSS,philhealth,loans, tax );

    }
}
class Payroll{
    public  void employee_info(String employee_Name, int Rendered_Hours, int RPH){

    }

    public static void totalDeduct(int SSS, int philhealth, int loans, int tax){}
    public void Net_Salary() {
        System.out.println("==========NET SALARY===============");
    }
    public static  void grossSalary1( int Rendered_Hours, int RPH) {
     int result =  Rendered_Hours *  RPH;
        System.out.print("Rate per Hour: " +result);// gross salary

    }
    public static void Deduction( int SSS, int PhilHealth, int loans, int tax) {
        int Total_Deduct = SSS + PhilHealth + loans + tax;
        System.out.println("Total Deduction: " + Total_Deduct +"\n"); //Total deduction

    }
    public static void netPay( int grossSalary, int total_Deduct) {
        int Php = (grossSalary - total_Deduct);
        System.out.println("Php: " + Php); // php

    }
}


