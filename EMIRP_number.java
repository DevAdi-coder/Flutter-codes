import java.util.*;
public class EMIRP_number
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

    int reverse (int n){//13
        int rev=0;
        while(n>0){//true
            rev=rev*10+n%10;//30+1
            n=n/10;//1
        }
        return rev;
    }

    public static void main ()
    {
        EMIRP_number gen=new EMIRP_number();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        if(gen.prime(number) && gen.prime(gen.reverse(number)))
            System.out.println("EMIRP number");
        else
            System.out.println("Not an EMIRP number");
    }
}
