public class testInheritance
{
    public static void main(String[] args) {
        Rectangle R=new Rectangle(4,5);
        System.out.println("Rectangle Area= "+R.calculateArea());
        Box B=new Box(6,17,8);
        System.out.println("Box Volume= "+B.getVolume());
    }
}
class Rectangle
{
    int width,length;
    Rectangle(int w,int l){
        width=w;
        length=l;
    }
    public int calculateArea(){
        return width*length;
    }
}
class Box extends Rectangle
{
    int depth;
    Box(int w,int l,int d){
        super(w,l);
        depth=d;
    }
    public int getVolume(){
        int pro=super.calculateArea();
        return pro*depth;
    }
}