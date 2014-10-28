
class MatrixChecker{

    public boolean isSymmetrical(int[] array)
    {
        for (int i=0; i <= (int) array.length(); i++)
        {
            if (array[i] != array[array.length() - i - 1])
            {
                return false;
            }
        }
        
        return true;
    }

    public boolean isSymmetrical(int[][] matrix)
    {
        int rows = matrix.length();
        int cols = matrix[0].length();
        
        for (int i=0; i < rows; i++)
        for (int j=0; j < cols; i++)
        {
        {
            if (matrix[i][j] != matrix[j][i])
            {
                return false;
            }
        }
        }
    
        return true;
    }
    
    public boolean isTriangular(int[][] matrix)
    {
        int rows = matrix.length();
        int cols = matrix[0].length();
        
        for (int i=0; i < rows; i++)
        for (int j=0; j < cols; i++)
        {
        {
            if ( j > i && matrix[i][j] != 0)
            {
                return false;
            }
        }
        }
    
        return true;
    }


}