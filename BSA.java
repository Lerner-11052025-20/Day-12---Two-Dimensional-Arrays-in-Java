public class BSA
{
    public static boolean check(int matrix[][], int key)
    {
        for(int i=0 ; i<matrix.length ; i++)
        {
            int a = 0; // 0
            int j = matrix[0].length-1; // 4-1 = 3
            int midIndex;
            int mid;
            while(a <= j)
            {
                midIndex = (a+j)/2;
                mid = matrix[i][midIndex];

                if(key == mid)  return true;
                else if(key > mid)  a = midIndex+1;
                else    j = midIndex-1;
            }
        }
        return false;
    }
    public static void main(String args[])
    {        
        int matrix2[][] = {{1, 2, 3, 40}, { 5, 6, 7, 8}, {2, 6, 99, 100}};
        int key = 100;

        System.out.println(check(matrix2, key));
    }
}