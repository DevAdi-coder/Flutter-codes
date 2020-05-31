package MyLibrery;
public class LowBalance extends Exception
{
    long balance;
    public LowBalance(long balance)
    {
        this.balance=balance;
    }
    public String toString()
    {
         return "Current widrawal will lower balance to "+balance+". Balance cannot be lower than 1000"; 
    }
}
