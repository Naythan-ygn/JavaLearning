public class Salary
{
    public static void main(String[] args) {
        int []salary = new int[5];
        int total = 0;
        for (int i=0;i<salary.length;i++){
            int n = (int)Math.round(Math.random()*3000);
            salary[i]=n;
            total= salary[i] + total;
        }
       average(total,salary);
    }

    public static void average(int b,int []a){
        System.out.println("Average= "+b/a.length);
    }

}
