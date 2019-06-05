public class TransactionRecord
{
    private int accountNumber;
    private double transactionAmount;
    
    TransactionRecord(int accountNumber, double transactionAmount)
    {
        this.accountNumber = accountNumber;
        this.transactionAmount = transactionAmount;
    }
    
    public int getAccountNumber()
    {
        return this.accountNumber;
    }
    
    public double getTransaction()
    {
        return this.transactionAmount;
    }
    
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    
    public void setTransactionAmount(int transactionAmount)
    {
        this.transactionAmount = transactionAmount;
    }
}
