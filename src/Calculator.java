import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {
        int a,b;
        a=get_Data();
        b=get_Data();
        int answer = Sum(a,b);
        System.out.println("Sum= " + answer);
        Sub(a,b);
        Average(answer);
    }
    public static int get_Data(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        return scan.nextInt();
    }
    public static int Sum(int x,int y){
        return x+y;
    }
    public static void Sub(int x,int y){
        System.out.println("Sub = "+(x-y));
    }
    public static void Average(int a){
        System.out.println("Average= "+(a/2));
    }
}
