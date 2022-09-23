public class testOverridden
{
    public static void main(String[] args) {
        SubClass sub=new SubClass();
        System.out.println(sub.getMessage());
    }
}
class SuperClass
{
    public String getMessage(){
        return "Super Message";
    }
}
class SubClass extends SuperClass
{
    public String getMessage(){
        return "Sub Message";
    }
}

