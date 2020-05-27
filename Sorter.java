import java.util.*;
class Sorter
{
    public static void Sort()
    {
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[10];
        System.out.println("Enter 10 numbers");
        for (int i=0; i<10; i++)
            numbers[i]=sc.nextInt();
        System.out.println("Sorted numbers");
        int sort;
        for(int i=0; i<10; i++)
        {
            for(int j=i; j<10; j++)
            {
                if(numbers[i]>numbers[j])
                {
                    sort=numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=sort;
                }
            }
        }
        for (int a=0; a<10; a++)
            System.out.println(numbers[a]);
    }
}