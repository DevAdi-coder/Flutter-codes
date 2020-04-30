import java.util.*;
public class Harshad_num
{
    public int add(int n)
    {
        int sum=0;
        while(n>0)//to check if it is completely reduced
        {
            int d=n%10;//extracts the number from the unit's place
            sum+=d;//ads the value in d to add
            n=n/10;//removes the unit's place  
        }
        return sum;
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);//Scanner class
        Harshad_num obj=new Harshad_num();//creates an object
        System.out.println("Enter a number");
        int num=sc.nextInt();//takes input from user
        if (num%obj.add(num)==0)//calls the function from the object and checks if it is divisible by user's input
            System.out.println("It's a Harshad number");//if true
        else
            System.out.println("It's not a Harshad number");//if false
    }
}
