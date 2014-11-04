package e6;
class Target{

    private int[][][] area;
    private int width;

public Target(int size)
{

    width = size;

    area = new int[size][size][size];
    
    for (int[][] i : area){
    for (int [] j : i){
    for (int k : j){
        k = 0;
    }
    }
    }
}

public void init()
{
    int x = (int) Math.abs(width * Math.random());
    int y = (int) Math.abs(width * Math.random());
    int z = (int) Math.abs(width * Math.random());

    area[x][y][z] = 1;
}

public Result fire (int x, int y, int z)
{

    if (x < 0 || y < 0 || z < 0 || x >= width || y >= width || z >= width)
    {
        return Result.OUT_OF_RANGE;
    }
    else if (area[x][y][z] == 1)
    {
        return Result.HIT;
    }
    else if (isOnGrid(area[x]))
    {

        if (isOnRow(area[x][y]))
        {
            for (int i = 0; i < z; i++)
            {
                if (area[x][y][i] == 1) {return Result.FAIL_HIGH;}
            }
            return Result.FAIL_LOW;
        }
        else
        {
            for (int i =0; i < y; i++)
            {
                if (isOnRow(area[x][i])) {return Result.FAIL_LONG;}
            }
            return Result.FAIL_SHORT;
        }
    }
    else
    {
        for (int i = 0; i < x; i++)
        {
            if (isOnGrid(area[i])) {return Result.FAIL_RIGHT;}
        }
    
        return Result.FAIL_LEFT;
    }



}

    private boolean isOnGrid( int [][] grid)
    {
        for (int[] row : grid )
        {
            if (isOnRow(row)) {return true;}
        }
        return false;
    }

    private boolean isOnRow( int[] row)
    {
        for (int i: row)
        {
            if (i==1) {return true;}
        }
        return false;
    }

}