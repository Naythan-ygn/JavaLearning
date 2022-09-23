public class exitclass
{
    public static void main(String[] args) {
        int index = 10;
        while(index <= 100){
            index+=10;
            if(index == 50) break;
            System.out.println("The index is "+ index);
        }
    }
}
