public class LSA
{
    public static boolean check(int matrix[][], int key)
    {
        for(int i=0 ; i<matrix.length ; i++)
        {
            for(int j=0 ; j<matrix[0].length ; j++)
            {
                if(matrix[i][j] == key)     return true;
            }
        }
        return false;
    }
    public static void count(int matrix[][], int key)
    {
        int count=0;
        for(int i=0 ; i<matrix.length ; i++)
        {
            for(int j=0 ; j<matrix[0].length ; j++)
            {
                if(matrix[i][j] == key)     count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String args[])
    {        
        int matrix2[][] = {{1, 99, 3, 40}, { 99 , 6, 7, 8}, {2, 6, 99, 0}};
        int key = 99;

        System.out.println(check(matrix2, key));
        count(matrix2, key);
    }
}