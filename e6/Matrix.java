

// really bad practice here using lots of i and j's at different levels - should improve this for clarity

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
    
        if (rowNum >= 0 && rowNum < j && countNum(rowValues) == i)
        {
        for (int i=0; i < countNum(rowValues); i++)
        mat[i][rowNum] = ithNum(rowValues,i,countNum(rowValues));
        }
    }

    public void setColumn(int colNum, String colValues)
    {
    
        if (colNum >= 0 && colNum < i && countNum(colValues) == j)
        {
        for (int j=0; j < countNum(colValues); j++)
        mat[colNum][j] = ithNum(colValues,j,countNum(colValues));
        }
    }

// not pretty for 10 digit long integers, but then that isnt really the point of the exercise
    public void prettyPrint()
    {
        for (int b=0; b < j; b++){
        for (int a=0; a < i; a++){
        
        System.out.print("\t" + mat[a][b]);
        
        }
        System.out.print("\n");
        }
        
    }

    public String toString()
    {
        String output = "[";


        for (int b = 0; b < j; b++) {
        for (int a = 0; a < i; a++) {
            
            output += mat[a][b];
            
            if (a == i - 1 && b != j - 1 )
            {
            output += ";";
            }
            else if (a == i - 1 && b == j - 1)
            {
            output += "]";
            }
            else
            {
            output += ",";
            }

        }
        }
    
        return output;
    }


    private int countNum(String input)
    {
    
    // Assumes user input correctly, without a , at the end
    
    int c = 1;
    
    for (int i=1; i <= input.length() - 1; i++)
    {
    if (input.charAt(i) == ',') {c++;}
    }
    
    return c;
    }
    
    private int ithNum(String input, int i, int num)
    {
        int commasPassed = 0, startPoint =0;
        
        while (commasPassed < i)
        {
        
            if (input.charAt(startPoint) == ',')
                { commasPassed++;}
        
            startPoint++;
        }
        
        if (commasPassed == num - 1)
        {
            return Integer.parseInt(input.substring(startPoint));
        }
        
        
        int endPoint = startPoint + 1;
        
        while ( input.charAt(endPoint) != ',') {endPoint++;}
        
        return Integer.parseInt(input.substring(startPoint,endPoint));
        
        
    }

}




