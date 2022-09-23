import java.util.Scanner;

public class Recursion
{
    public static void main(String[] args) {
        int num;
        Scanner scan= new Scanner(System.in);
        System.out.print ("Enter number for search factorial: ");
        num=scan.nextInt();
        System.out.println(num+"!="+Factorial(num));
    }
    public static int Factorial(int n){
        if (n>1)
            return n*Factorial(n-1);
        else
            return 1;
    }
}
