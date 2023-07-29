public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.setAccNo(1234);
        sa.setBalance(20000000.0f);
        sa.calculateInterest();

        CheckingAccount ca = new CheckingAccount();
        ca.setAccNo(1233);
        ca.setBalance(1000000.0f);
        ca.calculateInterest();
    }
}
