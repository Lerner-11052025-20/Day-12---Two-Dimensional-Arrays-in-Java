
public class MaxAndSmax
{
    public static void max(int matrix[][])
    {
        int max = Integer.MIN_VALUE + 1; //-2147483647
        int smax = Integer.MIN_VALUE; //-2147483648
        for(int i=0 ; i<matrix.length ; i++)
        {
            for(int j=0 ; j<matrix[0].length ; j++)
            {
                if(max < matrix[i][j])
                {
                    smax = max;
                    max = matrix[i][j];
                }
                else if(smax < matrix[i][j] && max != matrix[i][j])
                {
                    smax = matrix[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
    public static void main(String args[])
    {        
        int matrix2[][] = {{1, 2, 3, 40}, { 5, 6, 7, 8}, {2, 6, 9, 0}};
        max(matrix2);
    }
}