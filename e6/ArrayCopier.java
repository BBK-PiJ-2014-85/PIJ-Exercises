
class ArrayCopier{

public void copy (int[] src, int[] dst)
{

    for (int i=0; i<= dst.length - 1; i++)
    {
        dst[i]=0;
    }

    for (int i = 0; i <= src.length - 1; i++)
    {

        if (i < dst.length - 1)
        {
        dst[i] = src[i];
        }
    }

}

}
