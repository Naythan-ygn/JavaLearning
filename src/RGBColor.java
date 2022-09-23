public class RGBColor
{
    public static void main(String[] args) {
        int r=-1,g=-1,b=-1;
        getRGBColor(r,g,b);
        System.out.println("red= "+r+" green= "+g+" blue= "+b);
    }
    public static void getRGBColor(int r1,int g1,int b1){
        r1+=10;
        g1+=10;
        b1+=10;
        System.out.println("red= "+r1+" green= "+g1+" blue= "+b1);
    }
}
