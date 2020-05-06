import java.util.*;
public class Fibbonacci
{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int n=sc.nextInt();
        int t1=0,t2=1;
        for(int i=1;i<=n;i++)
        {
            System.out.print(t1+", ");
            int sum=t1+t2;
            t1=t2;
            t2=sum;
        }
    }
}