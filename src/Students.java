public class Students
{
    private String name,add;
    private int mark;
    public Students(String n,String a,int m){
        name = n;
        add= a;
        mark = m;
    }

    public static void main(String[] args) {
        Students st=new Students("De Dee","Yangon",100);
        System.out.println("Student Name= "+ st.name);
        System.out.println("Student Address= "+ st.add);
        System.out.println("Student Mark= "+st.mark);

    }
}
