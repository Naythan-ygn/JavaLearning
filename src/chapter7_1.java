import java.util.Arrays;

public class chapter7_1
{
    public static void main(String[] args) {
        char []A= new char[5];
        Arrays.fill(A,'a');
        for (int i=0; i<A.length; i++)
            System.out.println("A["+i+"]="+A[i]);
    }
}
