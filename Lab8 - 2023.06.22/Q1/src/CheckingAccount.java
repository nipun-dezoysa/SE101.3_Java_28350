public class CheckingAccount extends BankAccount{
    private int rate = 2;

    @Override
    public void calculateInterest(){
        float interest = super.getBalance()*rate/100;
        System.out.println("Interest:"+interest);
    }
}
