import java.util.*;
class mirror
{
    public static void matrix3()//main
    {
        Scanner sc=new Scanner(System.in);//Scanner class declaration
        System.out.println("Enter the size of the matrix: ");
        int size=sc.nextInt();//input
        int matrix[][]=new int[size][size];//declaration of array matrix with size
        int rep;
        for (int i=0; i<size; i++)//row
        {
            for(int j=0; j<size; j++)//column
            {
                System.out.println("Eneter the value in "+(j+1)+"st column of "+(i+1)+"th row of the matrix");
                matrix[i][j]=sc.nextInt();//input
            }
        }
        System.out.println("Original Matrix: ");
        for (int i=0; i<size; i++)//row
        {
            for(int j=0; j<size; j++)//column
            {
                System.out.print(matrix[i][j]+"    ");
            }
            System.out.println();
            System.out.println();
        }
        for (int j=0; j<Math.floor(size/2); j++)//to repeat it till the middle column
        {
            for(int i=0; i<size; i++)//for rows
            {
                rep=matrix[i][j];//to create a backup of the value in jth column of ith row
                matrix[i][j]=matrix[i][size-(j+1)];//replacement of [i][j] with the column at the opposite side  
                matrix[i][size-(j+1)]=rep;//to replace the old value of [i][size-j] with the value of the [i][j] value
            }
        }
        System.out.println("Mirrored matrix: ");
        for (int i=0; i<size; i++)//row
        {
            for(int j=0; j<size; j++)//column
            {
                System.out.print(matrix[i][j]+"    ");
            }
            System.out.println();
            System.out.println();
        }
    }
}