public class Main
{
    public static void main(String[] args) {
        int[]A = {2,5,3,1,4};
        // finding Sum.
        int total=0;
        for(int x : A){
            total = total + x;
        }
        System.out.println("Sum: " + total);

        // finding average.
        int avg;
        avg = total/A.length;
        System.out.println("Average: " + avg);

        // finding maximum.
        int max=0;
        for (int maxi: A) {
            if (max<maxi) {
                max = maxi;
            }
        }System.out.println("Maximum: " + max);

        // finding minimum.
        int min = 6;
        for (int mini:A ) {
            if (mini<min){
                min = mini;
            }
        }System.out.println("Minimum: "+min);
    }
}
