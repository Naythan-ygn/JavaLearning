public class Squares
{
    private int side;
    public Squares(){
        side = 4;
    }
    public int getArea(){
        return side*side;
    }

    public static void main(String[] args) {
        Squares sq= new Squares();
        System.out.println("Area of Square= "+sq.getArea());
    }
}
