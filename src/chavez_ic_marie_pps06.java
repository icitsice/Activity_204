import java.util.Scanner;
public class chavez_ic_marie_pps06 {
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int a; //32
    int b; //24
    int c; //20

        System.out.print("Enter num1 : ");
    a =(int)input.nextFloat();
        System.out.print("Enter num2: ");
    b =(int)input.nextFloat();
        System.out.print("Enter num3: ");
    c =(int)input.nextFloat();

        if(a<b & a<c)
            System.out.println(a +" "+b +" "+c);
        if((c<a &c<b))
            System.out.println(c +" "+b +" "+a);

        else if((b<c & b<a))

            System.out.println(b +" "+c +" "+a);

}
}

