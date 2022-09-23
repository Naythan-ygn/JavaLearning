import java.util.Scanner;

class Student
{
    String Name;int StudentNo;
    Student(){
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Name= ");
//        Name= scan.nextLine();
//        System.out.print("Student NO.= ");
//        StudentNo=scan.nextInt();
        StudentNo=0;
        Name=null;
    }
    Student(int sn,String n){
        StudentNo=sn;
        Name=n;
    }
    public void Display(){
        System.out.println("Student NO.= "+ StudentNo);
        System.out.println("Student Name= "+ Name);
    }
}
class GraduateStudent extends Student
{
    String credit;
    GraduateStudent(){
//        Scanner grad=new Scanner(System.in);
//        System.out.print("Credit Score= ");
//        credit=grad.nextInt();
        super();
        credit=null;
    }
    GraduateStudent(int sn,String n,String c){
        super(sn,n);
        credit=c;
    }
    public void Display(){
        super.Display();
        System.out.println("Graduated with "+credit+" credit.");
    }
}

public class Chapter10Ass
{
    public static void main(String[] args)throws Exception {
        Scanner scan= new Scanner(System.in);

        GraduateStudent[] gst=new GraduateStudent[10];
        for (int i=0;i< gst.length;i++){
//            System.out.print("Student NO.= ");
//            int StudentNo= scan.nextInt();
            System.out.print("Name= ");
            String Name= scan.nextLine();
            System.out.print("Credit Score= ");
            String Credit= scan.nextLine();
            System.out.println();
            gst[i]=new GraduateStudent((i+1),Name,Credit);
        }
        for (int i=0;i<gst.length;i++){
            gst[i].Display();
            System.out.println("-------------------");
        }
    }
}