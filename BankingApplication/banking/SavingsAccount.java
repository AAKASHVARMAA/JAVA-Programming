package banking;

public class SavingsAccount extends BankAccount{
    private double minimumBalance;
    public SavingsAccount(String accountNumber,double balance,double intrestRate, double minimumBalance)

    {
        super(accountNumber, balance, intrestRate);
        this.minimumBalance=minimumBalance;
    }
    
    public void withdraw(double amount)
    {
        if(getBalance()-amount >= minimumBalance)
        {
            balance -= amount; 
            System.out.println("Withdrawn Rs" + amount +  "  Remaining balance: Rs" + getBalance());
        }
        else{
            System.out.println("Withdrawal denied: Minimum balance requirement not met.");
        }
    }
 }