import java.util.Scanner;

public class Basic
{
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
                    System.out.print(matrix[i][j]+ " ");
                }
                System.out.println();
            }
            
            System.out.println("\n");
            
            for(int i=0 ; i<matrix.length ; i++)
            {
                for(int j=0 ; j<matrix[0].length ; j++)
                {
                    matrix[i][j] = sc.nextInt();
                }            
            }  
            
            for(int i=0 ; i<matrix.length ; i++)
            {
                for(int j=0 ; j<matrix[0].length ; j++)
                {
                    System.out.print(matrix[i][j]+ " ");
                }
                System.out.println();
            }
            sc.close();
        }
        
        System.out.println();
        int matrix2[][] = {{1, 2, 3, 4}, { 5, 6, 7, 8}, {2, 6, 9, 0}};
        for(int i=0 ; i<matrix2.length ; i++)
        {
            for(int j=0 ; j<matrix2[0].length ; j++)
            {
                System.out.print(matrix2[i][j]+ " ");
            }
            System.out.println();
        }

    }
}