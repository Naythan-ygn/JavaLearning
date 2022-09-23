import java.util.Arrays;
import java.util.Scanner;

public class Chapter7_2
{
    public static void main (String[] args)
    {
        int []arr={70,35,100,40,80,90,50,70,45,28};
        //a
        Arrays.sort(arr);
        System.out.print ("Sorted Array of Arr[]= ");
        print(arr);
        //b
        int Sum=sum(arr);
        System.out.print ("The Sum of Array= "+Sum);
        System.out.println ();
        //c
        average(arr,Sum);
        //d
       Search(arr);
    }

    public static void print(int []a){
        for (int j : a) System.out.print(j + "\t");
        System.out.println ();
    }
    public static int sum (int[] a){
        int sum=0;
        for (int j : a) {
            sum = sum + j;
        }
        return sum;
    }
    public static void average(int[] a,int b){
        int avg=b/a.length;
        System.out.print ("Average of Array= "+avg)	;
        System.out.println ();
    }
    public static void Search(int []a){
        //binarySearch.
        Scanner scan= new Scanner(System.in);
        System.out.print ("Enter Number: ");
        int num=scan.nextInt();
        int b=Arrays.binarySearch(a,num);
        if (b>0)
            System.out.println ("found at position "+ b);
        else
            System.out.println ("Number not found.");
    }
    public static void LinearSearch(int []a){
        int search;
        boolean found=false;
        Scanner scan= new Scanner(System.in);
        System.out.print ("Enter Number: ");
        search= scan.nextInt();
        for (int i=0; i<a.length; i++){
            if (search == a[i]){
                found = true;
                System.out.println(search +" found at "+ i);
            }
        }
        if(!found)
            System.out.println("Number not found.");
    }
}
