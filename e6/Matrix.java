

class Matrix
{
    private int[][] mat;
    private int i=-1,j=-1;

    public Matrix(int a, int b)
    {
        i = a;
        j = b;
    
        mat = new int[a][b];

        for (int i=0; i < a; i++)
        {
        for (int j=0; j < b; j++)
        {
        mat[i][j]=1;
        }
        }
    }
    
    public void setElement(int a, int b, int c)
    {
        if (a >= 0 && a < i && b >= 0 && b < j)
        {
        mat[a][b] = c;
        }
    }
    
    public void setRow(int rowNum, String rowValues)
    {

    
    }


}




