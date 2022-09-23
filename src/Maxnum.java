import java.util.Scanner;

public class Maxnum
{
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan= new Scanner(System.in);
        System.out.print ("Enter First no. : ");
        a=scan.nextInt();
        System.out.print ("Enter Second no. : ");
        b=scan.nextInt();
        System.out.print ("Enter Third no. : ");
        c= scan.nextInt();
        if (a>b && b>c)
            System.out.println("Max no = "+a);
        else if (b>a && a>c)
            System.out.println("Max no. = "+b);
        else
            System.out.println("Max no. = "+ c);
    }
}
