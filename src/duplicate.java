import javax.swing.text.html.StyleSheet;
import java.util.Arrays;

public class duplicate
{
    public static void main(String[] args) {
        int []a={22,14,6,8,44,20};
        System.out.print("Array a= ");
        print(a);
        int[] b=(int[])a.clone();
        System.out.print("Clone array b= ");
        print(b);
        System.out.print("Arrays.equals(a,b)="+ Arrays.equals(a,b)+"\n");
        int i = Arrays.binarySearch(a,44);
        System.out.print("Found at position: "+ i);
        Arrays.sort(a);
        System.out.println();
        System.out.print("Sorted array a[]= ");
        print(a);
        String[]c={"AB","CD","EF"};
        print(c);
        String[]d=(String[]) c.clone();
        print(d);
        c[1]="XYZ";
        print(c);
        print(d);
        int[]ch=new int[20];
        Arrays.fill(ch,1);
        print(ch);
    }
    public static void print(int []a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"");
        }
        System.out.println();
    }
    public static void print(String []a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"");
        }
        System.out.println();
    }

}
