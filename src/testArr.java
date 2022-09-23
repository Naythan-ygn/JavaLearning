public class testArr
{
    public static void main(String[] args) {
        int []intArray={6,1,3};
        System.out.println("Before Calling");
        display(intArray);
        change(intArray);
        System.out.println("After Calling");
        display(intArray);
    }
    public static void change(int a[]){
        for (int i=0;i<a.length;i++){
            a[i]=3*a[i];
        }
    }
    public static void display(int a[]){
        for (int i=0;i<a.length;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
