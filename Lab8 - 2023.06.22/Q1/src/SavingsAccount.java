public class SavingsAccount extends BankAccount{
    private int rate = 12;

    @Override
    public void calculateInterest(){
        float interest = super.getBalance()*rate/100;
        System.out.println("Interest:"+interest);
    }
}
