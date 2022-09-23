public class BankRec
{
    public static void main(String[] args) {
        bank ba= new bank();
        ba.dispaly();
        ba.balInc(500.00);
        ba.balDec(200.00);
        System.out.println();

        bank ba1= new bank("De Dee","10110",2000.00);
        ba1.dispaly();
        ba1.balInc(700.00);
        ba1.balDec(500.00);
    }
}
class bank
{
    String AccountName,AccountNum;
    double balance;
    public bank(){
        AccountName="John";
        AccountNum="12345";
        balance=1000.00;
    }
    public bank(String aName, String aNum, double bal){
        AccountName=aName;
        AccountNum=aNum;
        balance=bal;
    }
    public void dispaly(){
        System.out.println("Account Name= "+AccountName);
        System.out.println("Account Number= "+AccountNum);
        System.out.println("Balance= "+balance);
    }
    public void balInc(double inc){
        balance=balance+inc;
        System.out.println("Increase Balance= "+balance);
    }
    public void balDec(double dec){
        balance=balance-dec;
        System.out.println("Decrease Balance= "+balance);
    }
}
