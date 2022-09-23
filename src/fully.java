interface inter01{
    void show();
    void get();
}
class childClass implements inter01{
    public void show(){
        System.out.println("Show method is invoked");
    }

    @Override
    public void get() {
        System.out.println("Get method is invoked");
    }
}
public class fully {
    public static void main(String[] args) {
        inter01 obj1=new childClass();
        System.out.println("Output");
        obj1.show();
        obj1.get();
    }
}
