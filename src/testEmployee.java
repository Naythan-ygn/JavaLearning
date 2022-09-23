public class testEmployee
{
    public static void main(String[] args) {
        Employee E[]=new Employee[3];
        E[0]=new Manager("John","Manager",1000,1000);
        E[1]=new Lecturer("Susan","Lecturer",5000,700);
        E[2]=new OfficeStaff("David","Office Staff",3500);
        for (int i=0;i<E.length;i++){
            E[i].Display();
            System.out.println("Salary= "+E[i].Pay_Salary());
            System.out.println("--------------*------------");
        }
    }
}
abstract class Employee
{
    String name,post;
    double basicSalary;
    Employee(String n,String p,double bs){
        name=n;
        post=p;
        basicSalary=bs;
    }
    public void Display(){
        System.out.println("Name= "+name);
        System.out.println("Post= "+post);
    }
    public abstract double Pay_Salary();
}
class Manager extends Employee
{
    double allowance;
    Manager(String n,String p, double bs, double a){
        super(n,p,bs);
        allowance=a;
    }
    public double Pay_Salary(){
        return (basicSalary+allowance);
    }
}
class Lecturer extends Employee
{
    double bonus;
    Lecturer(String n,String p,double bs,double b){
        super(n,p,bs);
        bonus=b;
    }
    public double Pay_Salary(){
        return (basicSalary+bonus);
    }
}
class OfficeStaff extends Employee
{
    OfficeStaff(String n,String p,double bs){
        super(n,p,bs);
    }
    public double Pay_Salary(){
        return basicSalary;
    }
}
