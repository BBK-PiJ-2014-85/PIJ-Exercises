package e6;
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

public void copy (String[] src, String[] dst)
{

// Added to be used in exercise e6_7
    
    for (int i=0; i<= dst.length - 1; i++)
    {
        dst[i]="";
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
