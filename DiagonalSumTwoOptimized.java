public class DiagonalSumTwoOptimized
{
    public static int sum(int matrix[][])
    {
        int sum=0;
        for(int i=0 ; i<matrix.length ; i++)
        {
            sum+=matrix[i][i];
            if( i != matrix.length-1-i)     sum+=matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void main(String args[])
    {        
        int matrix2[][] = {{1, 2, 3, 4}, 
                            { 1, 2, 3, 4}, 
                            {2, 2, 3, 4}, 
                            {3, 3, 3, 5}};
        System.out.println(sum(matrix2));
        int matrix3[][] = {{1, 2, 3}, 
                            { 1, 2, 3}, 
                            {2, 2, 3}};
        System.out.println(sum(matrix3));
    }
}