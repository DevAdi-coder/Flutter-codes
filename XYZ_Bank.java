import java.util.*;//import <package-name><file-name><resourse>;
//creating and using resources from other packages
import MyLibrery.*;
public class XYZ_Bank
{
    long total_amt; String name;
    Scanner entries=new Scanner(System.in);
    XYZ_Bank(String customer)
    {
        name=customer;
        total_amt=1000;
    }
    void accept()
    {
        System.out.println("Enter money to your account:");
        int entry=entries.nextInt();
        total_amt+=entry;
    }
    void widraw() throws LowBalance
    {
        System.out.println("Enter amount to widraw:");
        int entry=entries.nextInt();
        //catching defined exceptions
        if(total_amt-entry <1000)
        throw  new LowBalance(total_amt-entry);
        
        total_amt-=entry;
    }
    void display()
    {
        System.out.println("Customer name: "+name);
        System.out.println("Balance in Account: "+total_amt);
    }
    public static void main()
    {
        Scanner atm=new Scanner(System.in);
        System.out.println(" -----------------------Welcome to XYZ ATM----------------------- ");
        System.out.println("Enter your name:");
        String customer=atm.nextLine();
        XYZ_Bank account=new XYZ_Bank(customer);
        while(true)
        {
            System.out.println("Enter 1 to add money from savings");
            System.out.println("Enter 2 to  Widraw to your savings");
            System.out.println("Enter 3 to view Account Balance");
            int choice =atm.nextInt();
            if(choice==0) 
            break;
            switch(choice)
            {
                case 1:
                account.accept();
                break;  //break statement hence no fall through
                case 2:
                try{
                 account.widraw();
                }
                 catch(LowBalance e){
                   System.out.println(e);
                }
                break;
                case 3:
                account.display();
                //no break statement hence fall through
                default:
                System.out.println("Enter 0 to exit:");
            }
        }
        System.out.println("Thank you, Visit Again!!");
        atm.close();  
        //closing of a scanner resource
    }
}
