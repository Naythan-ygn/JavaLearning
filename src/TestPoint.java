public class TestPoint
{
    public static void main(String[] args) {
        Point p=new Point(4,5);
        System.out.println("p="+p);
        Point q=new Point(p);
        System.out.println("q="+q);
        if (q.equals(p))
            System.out.println("q equals p.");
        else
            System.out.println("q does not equal p.");
    }
}
class Point
{
    private int x,y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Point(Point pt){
        x=pt.x;
        y=pt.y;
    }
    public String toString(){
        return ("("+x+","+y+")");
    }
    public boolean equals(Point p){
        return (x==p.x && y==p.y);
    }
}
