import java.util.*;
public class array_boundary
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int size=sc.nextInt();
        int matrix[][]=new int[size][size];
        for (int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                System.out.println("Enetr the value in "+(i+1)+"st row of "+(j+1)+"th column of the matrix");
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i=1; i<size-1; i++)
        {
            for(int j=1; j<size-1; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/* ---------------------Eleminating boundary elemants-----------------------------
 * Problem-matrix:
 * 1011
 * 1213
 * 1415
 * 1617
 * Solution-matrix:
 * 21
 * 41
 */