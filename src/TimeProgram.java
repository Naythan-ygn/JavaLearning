public class TimeProgram
{
    public static void main(String[] args) {
        Time t1= new Time(5,53,15);
        t1.display();
        Time t2= new Time(2,38,12);
        t2.display();
        System.out.println("-------------------");
        Time t3=new Time();
        t3.Add(t1,t2);
        t3.display();
    }
}
class Time
{
    int hour,minute,second;
    public Time(){
        hour=0;
        minute=0;
        second=0;
    }
    public Time(int h1,int m1,int s1){
        hour=h1;
        minute=m1;
        second=s1;
    }
    public void display(){
        System.out.println(hour+"\t:\t"+minute+"\t+\t"+second);
    }
    public void Add(Time ti1, Time ti2){
        hour=ti1.hour+ti2.hour;
        minute=ti1.minute+ ti2.minute;
        second=ti1.second+ti2.second;
        if (second>=60){
            minute+=1;
            second-=60;
        }
        if (minute>=60){
            hour+=1;
            minute-=60;
        }
    }
}
