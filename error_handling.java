public class error_handling
{
    public static void main ()
    {
        try
        {
            int a=9,b=0;
            System.out.println("Division of 9 and 0: "+a/b);
            System.out.println("This statement will not get printed");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division of 9 and 0: 0");
        }
        System.out.println("This statement will get printed");
    }
}