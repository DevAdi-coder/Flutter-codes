import java.util.*;
class Binary
{
    String code;
    String factor (char alpha)
    {
        int ascii=(int)alpha, rem=0;
        code="";
        while (ascii>1)
        {
            rem=ascii%2;
            ascii=ascii/2;
            code=rem+code;
        }
        return code;
    }

    public static void Convert()
    {
        Scanner sc=new Scanner(System.in);
        Binary run=new Binary();
        System.out.println("Enter a sentence to convert into binary code");
        String speech=sc.nextLine();
        System.out.println("Your binary code:");
        for (int i=0; i<speech.length(); i++)
        {
            System.out.print(run.factor(speech.charAt(i))+" ");
        }
    }
}
