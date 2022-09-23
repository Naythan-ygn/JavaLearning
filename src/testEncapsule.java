import java.util.Scanner;

public class testEncapsule
{
    public static void main(String[] args) {
        Staff st=new Staff();
        st.setName();
        st.setAge();
        System.out.println("Name= "+st.getName());
        System.out.println("Age= "+ st.getAge());
        System.out.println();

        Staff st1=new Staff();
        st1.setName();
        st1.setAge();
        System.out.println("Name= "+st1.getName());
        System.out.println("Age= "+ st1.getAge());
    }
}
class Staff
{
    private String name;
    private int age;
    private final Scanner scan= new Scanner(System.in);
    public void setName(){
        System.out.print("Enter Staff name: ");
        name= scan.nextLine();
    }
    public void setAge(){
        System.out.print("Enter staff age: ");
        age= scan.nextInt();
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
