import java.util.*;
public class Smith_num
{
    boolean prime (int num)
    {
        int dividend=0;
        for(int factor=1; factor<=num; factor++){
            if(num%factor==0)
                dividend++;
        }
        if (dividend==2)
            return true;
        else
            return false;
    }

    int add(int num)
    {
        int add=0;
        int m=0, d=0;
        m=num; 
        while (m>0)
        {
            d=m%10;
            add=add+d;
            m=m/10;
        }
        return add;
    }

    int factorisation(int dividend)
    {
        int factor=2, add=0;//initialisation
        while (dividend>1)//repeats until dividend is 1
        {
            factor=2;            
            while (dividend%factor!=0)//checks if the var factor is divisible with the main number
            {
                factor++;//if not divisible, changes the divisior by 1;
            }
            dividend=dividend/factor;//reduces the dividend to the divided value
            if(prime(factor))//checks If prime
                add=add+add(factor);//keeps the dividend adding to it
        }
        return add;
    }

    public static void smith()
    {
        Scanner sc=new Scanner(System.in);      
        Smith_num obj=new Smith_num();
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(obj.add(num)==obj.factorisation(num))
            System.out.println("Smith number");
        else
            System.out.println("Not a Smith number");
    }
}