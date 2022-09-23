public class TestConstr
{
    private String name;
    private int age;
    public TestConstr(String str,int a){
        name =str;
        age=a;
    }
    public TestConstr(){
        name="Susan";
        age = 10;
    }

    public String getName() {
            return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        TestConstr tc=new TestConstr("Jackson",4);
        System.out.println("Name is "+tc.getName());
        System.out.println("Age is "+tc.getAge());
        TestConstr ts= new TestConstr();
        System.out.println("Name is "+ts.getName());
        System.out.println("Age is "+ts.getAge());

    }
}
