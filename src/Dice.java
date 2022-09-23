import java.util.Random;

public class Dice
{
    public static void main(String[] args) {
        System.out.println("You have six throws of a pair of dice.\n"+"The objective is to get a double six.Here goes...\n");
        Random diceValues= new Random();
        String []goes = {"First","Second","Third","Fourth","Fifth","Sixth"};
        int die1 = 0;
        int die2 = 0;
        for (int i=0;i<goes.length;i++){
            die1 = diceValues.nextInt(6)+1;
            die2 = 1+ diceValues.nextInt(6);
            System.out.println(goes[i]+" throw : "+die1+","+die2);
            if (die1+die2 == 12){
                System.out.println(" You Win!!");
                return;
            }
        }
        System.out.println("Sorry,you lost ...");
        return;
    }
}
