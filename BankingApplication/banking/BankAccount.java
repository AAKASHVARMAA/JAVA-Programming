package banking;

public class BankAccount{
    private String accountNumber;
    protected double balance;
    private double intrestRate;

    public BankAccount(String accountNumber,double balance,double intrestRate)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.intrestRate=intrestRate;
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
             balance+=amount;
            System.out.println("Deposited Rs" + amount + " New balance: Rs" + balance);
        }
       
    }
    public double getBalance()
    {
        return balance;
    }
}



