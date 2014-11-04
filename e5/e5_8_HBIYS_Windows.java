package e5;
class e5_8_HBIYS_Windows{

static int count=0;

public static void main (String[] args)
{
    addToStack();
}

private static void addToStack()
{
    count++;
    System.out.println(count);
    addToStack();
}

}
