interface inter001{
    void show();
    void get();
}
abstract class MessageClass implements inter001{
    public void show(){
        System.out.println("show() method is invoked.");
    }
    public void set(){
        System.out.println("set() method is invoked.");
    }
}
class Partial extends MessageClass{
    public void get(){
        System.out.println("get() method is invoked.");
    }
}
public class testPartial
{
    public static void main(String[] args) {
        System.out.println("Output");
        System.out.println("Partial implementation of an interface.");
        Partial pa=new Partial();
        pa.show();pa.get();pa.set();
    }
}
