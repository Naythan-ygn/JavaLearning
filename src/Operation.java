import javax.management.ObjectName;

interface inter1{
    int a=15,b=23;
}
interface inter2 extends inter1{
    void Sum();
    void Product();
}
public class Operation implements inter2
{
    public void Sum(){
        System.out.println("Sum= "+(a+b));
    }
    public void Product(){
        System.out.println("Product="+(a*b));
    }
    public static void main(String[] args) {
        Operation Obj= new Operation();
        Obj.Sum();
        Obj.Product();
    }
}
