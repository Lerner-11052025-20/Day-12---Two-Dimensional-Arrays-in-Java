import java.util.Scanner;

public class DifferenceOfMatrices
{
    public static void differenceOfMatrices(int matrix1[][] , int matrix2[][])
    {
        int difference[][] = new int[matrix1.length][matrix1[0].length];
            for(int i=0 ; i<difference.length ; i++)
            {
                for(int j=0 ; j<difference[0].length ; j++)
                {
                    difference[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            
            for(int i=0 ; i<difference.length ; i++)
            {
                for(int j=0 ; j<difference[0].length ; j++)
                {
                    System.out.print(difference[i][j]+ " ");
                }
                System.out.println();
            }
    }
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {

            int n=sc.nextInt();
            int m=sc.nextInt();    
            int matrix[][] = new int[n][m];            
            for(int i=0 ; i<matrix.length ; i++)
            {
                for(int j=0 ; j<matrix[0].length ; j++)
                {
                    matrix[i][j] = sc.nextInt();
                }            
            } 
            
            int n1=sc.nextInt();
            int m1=sc.nextInt();
    
            int matrix1[][] = new int[n1][m1];
            
            for(int i=0 ; i<matrix1.length ; i++)
            {
                for(int j=0 ; j<matrix1[0].length ; j++)
                {
                    matrix1[i][j] = sc.nextInt();
                }            
            }

            differenceOfMatrices(matrix, matrix1);
        }
    }
}