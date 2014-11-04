package e6;

class Matrix2 extends Matrix{

    public void setMatrix(String input)
    {
        int rowNum = 0;
        String rowVals="";
        //assume input is accurate
        for (int i=0; i< input.length(); i++)
        {
    
            if (input.charAt(i) == ';')
            {
                setRow(rowNum, rowVals);
                rowNum++;
                rowVals="";
            }
            else
            {
                rowVals += input.charAt(i);
                if (i == input.length() - 1)
                {
                    setRow(rowNum, rowVals);
                }
            }
        }
    
    }

    public Matrix2(int a, int b)
    {
        super(a,b);    }

}