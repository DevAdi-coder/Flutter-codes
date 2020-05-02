import java.util.*;
public class Smith_num
{
    boolean prime (int num)
    {
        int factor=0;
        for(int count=1; count<=num; count++){
            if(num%count==0)
                factor++;
        }
        if (factor==2)
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

    int factorisation(int factor)
    {
        Smith_num opt=new Smith_num();//object
        int count=2, res=0;//initialisation
        while (factor>1)//repeats until factor is 1
        {
            count=2;            
            while (factor%count!=0)//checks if the var count is divisible with the main number
            {
                count++;//if not divisible, changes the divisior by 1;
            }
            factor=factor/count;//reduces the factor to the divided value
            if(opt.prime(count))//checks If prime
                res=res+opt.add(count);//keeps the factor adding to it
        }
        return res;
    }

    public static void main()
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