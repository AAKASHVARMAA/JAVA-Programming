import banking.BankAccount;
import banking.SavingsAccount;
public class MainApp
{
    public static void main(String[] args)
    {
        BankAccount BnkAcc=new BankAccount("12345",500,5);
        BnkAcc.deposit(500);
        SavingsAccount SvngAcc=new SavingsAccount("67890", 3000, 5, 1500);
        SvngAcc.deposit(300);
        SvngAcc.withdraw(1000);
        SvngAcc.withdraw(5000);

    }
}