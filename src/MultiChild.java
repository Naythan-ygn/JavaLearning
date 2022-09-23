public class MultiChild
{
    public static void main(String[] args) {
        Square s=new Square("Square",5);
        System.out.println("Name= "+s.getName());
        System.out.println("Square Area= "+s.getArea());
        Circle c=new Circle("Circle",7);
        System.out.println("Name= "+c.getName());
        System.out.println("Circle Area= "+c.getArea());
    }
}
class Shape{
    protected String name;
    Shape(String n){
        name=n;
    }
    String getName(){
        return name;
    }
}
class Square extends Shape
{
    int side;
    Square(String n,int s){
        super(n);
        side=s;
    }
    int getArea(){
        return side*side;
    }
}
class Circle extends Shape
{
    int radius;
    Circle(String n,int r){
        super(n);
        radius=r;
    }
    double getArea(){
        return (3.14159*radius*radius);
    }
}
