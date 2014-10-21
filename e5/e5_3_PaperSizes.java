/* A Din-A0 sheet of paper is 841mm
×
1189mm (its surface is one square meter). Successive measureme
nts of paper
are defined recursively as “half” or “double” the preceding size. Th
erefore, a Din-A1 sheet of paper is half of
Din-A0, or 594mm
×
841mm; while a Din-A00 is double of Din-A0, or 1189mm
×
1682mm.
Create a method that takes a String parameter representing a siz
e (e.g. ”A4”, “A00000”) and prints on screen
the size of the corresponding sheet of paper. For simplicity, you ca
n ignore rounding errors when calculating smaller
sizes. */

public class e5_3_PaperSizes{

    public static void main (String[] args){

    getPaperSize("A0");
    getPaperSize("A1");
    getPaperSize("A00");

    }


    static void getPaperSize(String size)
    {

    int sizeInt=0;

    if (size.charAt(1) == '0')
    {
        sizeInt = 0 - size.length() + 2 ;
    }
    else
    {
        sizeInt = Integer.parseInt(size.substring(1));
    }
    double[] dimensions = paperSizeRecur(sizeInt);
    System.out.println( "Size of paper " + size + " is " + dimensions[0] + "mm x " + dimensions[1] + "mm.");
    }

    static double[] paperSizeRecur(int size)

    {
    // let size = 0 be A0

    if (size==0)
    {
    return new double[] {841,1189};
    }

    else if (size > 0)
    {
        return new double[] {paperSizeRecur(size - 1)[1] / 2, paperSizeRecur(size - 1)[0]};
    }

    else
    {
        return new double[]{paperSizeRecur(size+1)[1] , paperSizeRecur(size+1)[0] * 2};
    }

    }


}