import java.util.Scanner;

public class testMethod
{
    public static void main(String[] args) {
        Largest();
    }
    public static void Largest(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int first=scan.nextInt();
        System.out.print("Enter Second Number: ");
        int second= scan.nextInt();
        System.out.print("Enter Third Number: ");
        int third=scan.nextInt();

        if (first > second && second > third)
            System.out.println(first+" is the largest number.");
        else if (second > first && first > third)
            System.out.println(second+" is the largest number.");
        else
            System.out.println(third+" is the largest number.");
    }
}
