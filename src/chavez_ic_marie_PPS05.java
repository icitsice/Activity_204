import java.util.Scanner;
public class chavez_ic_marie_PPS05 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        String Employee;
        float renderedHours;
        float ratePerHour;
        float SSS;
        float PhilHealth;
        float Loans;
        float gSalary;
        float Tax;
        float totalDeduction;
        float netSalary;

        System.out.print("Employee Name: ");
        Employee = input.nextLine();
        System.out.print("Rendered Hours: ");
        renderedHours = input.nextFloat();
        System.out.print("Rate per Hours: ");
        ratePerHour = input.nextFloat();
        System.out.print("SSS Contribution: ");
        SSS = input.nextFloat();
        System.out.print("PhilHealth Contribution: ");
        PhilHealth = input.nextFloat();
        System.out.print("Loans: ");
        Loans = input.nextFloat();

        gSalary = renderedHours * ratePerHour;
        Tax =(float) 0.1* gSalary;
        totalDeduction = SSS + PhilHealth + Loans + Tax;
        netSalary = gSalary - totalDeduction;

        System.out.println("\n\n\n============Payslip============");
        System.out.println("======EMPLOYEE INFORMATION======");
        System.out.println("Employee Name: " + Employee);
        System.out.println("Rendered Hours: " + renderedHours);
        System.out.println("Rate per Hours: " + ratePerHour);
        System.out.println("Gross Salary: " + gSalary);

        System.out.println("===========DEDUCTIONS===========");
        System.out.println("SSS            : " + SSS);
        System.out.println("PhilHealth     : " + PhilHealth);
        System.out.println("Loans          : " + Loans);
        System.out.println("Tax            : " + Tax);
        System.out.println("Total Deduction: " + totalDeduction);

        System.out.println("===========NET SALARY===========");
        System.out.println("PHP            : " + netSalary);
    }
}
