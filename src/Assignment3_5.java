import java.util.Scanner;

public class Assignment3_5
{
    public static void main(String[] args)throws Exception {
        //Chapter 3.5 assignment.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first no. = ");
        int a = scan.nextInt();
        System.out.print("Enter second no. = ");
        int b = scan.nextInt();
        System.out.print("Enter third no. = ");
        int c = scan.nextInt();

        String Ascending,Descending;
        System.out.print("Ascending or Descending (A/D) : ");
        char ch = (char)System.in.read();
        switch (ch){
            case 'A': case 'a': System.out.println("Ascending Order");break;
            case 'D': case 'd': System.out.println("Descending Order");break;
            default: System.out.println("Unknown_Error");
        }

        if (ch == 'a' || ch == 'A'){
            if(a<b && b<c)
                System.out.println(a+"\t"+b+"\t"+c);
            else if (a<c && c<b)
                System.out.println(a+"\t"+c+"\t"+b);
            else if (b<a && a<c)
                System.out.println(b+"\t"+a+"\t"+c);
            else if (b<c && c<a)
                System.out.println(b+"\t"+c+"\t"+a);
            else if (c<a && a<b)
                System.out.println(c+"\t"+a+"\t"+b);
            else
                System.out.println(c+"\t"+b+"\t"+a);
        }
        else if (ch == 'D' || ch == 'd') {
            if (a > b && b > c)
                System.out.println(a+"\t"+b+"\t"+c);
            else if (a > c && c > b)
                System.out.println(a+"\t"+c+"\t"+b);
            else if (b > a && a > c)
                System.out.println(b+"\t"+a+"\t"+c);
            else if (b > c && c > a)
                System.out.println(b+"\t"+c+"\t"+a);
            else if (c > a && a > b)
                System.out.println(c+"\t"+a+"\t"+b);
            else
                System.out.println(c+"\t"+b+"\t"+a);
        }
        else
            System.out.println("Error Ordering");
    }
}
