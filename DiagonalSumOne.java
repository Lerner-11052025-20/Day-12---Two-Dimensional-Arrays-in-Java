public class DiagonalSumOne
{
    public static int sum(int matrix[][])
    {
        int sum=0;
        for(int i=0 ; i<matrix.length ; i++)
        {
            for(int j=0 ; j<matrix[0].length ; j++)
            {
                if(i==j)    sum+=matrix[i][j];
                else if(i+j == matrix.length-1)     sum+=matrix[i][j];
            }
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