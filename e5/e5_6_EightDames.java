/*Create a method that calculates the solution to the problem of the e
ight Dames: “given a chess board, and knowing
that the Dame can reach any tile horizontally, vertically, or diagonally
, place 8 Dames on the board so that none
of them can reach the others by doing only one move". You can retu
rn the solution as an array of 8x8 booleans
where eight tiles are true (those with the Dames on them) and the ot
hers are false.
For extra complexity, make your method return all the possibilities in
which the problem can be solved (this
may take a long time).*/

//doesnt insist on a grid of booleans, i think it is easier to use an 8 x 8 grid defined by coordinates from
    //1 to 8 in each direction

public class e5_6_EightDames{

static int numberOfSolutions=0;

    public static void main (String[] args){

    Point[] board = new Point[64];
    int col=0, row = 0;

    for (int i=0; i<64; i++)
    {
    if (col > 7) {col=0; row++;}

    board[i] = new Point(col, row);
    col++;
    }

    for (int i0=0;i0<=7;i0++)
    {
        Point p0 = new Point(0,i0);

    for (int i1=0;i1<=7;i1++)
    {
          Point p1 = new Point(1,i1);

    for (int i2=0;i2<=7;i2++)
    {
          Point p2 = new Point(2,i2);
    for (int i3=0;i3<=7;i3++)
    {
          Point p3 = new Point(3,i3);
    for (int i4=0;i4<=7;i4++)
    {
          Point p4 = new Point(4,i4);
    for (int i5=0;i5<=7;i5++)
    {
          Point p5 = new Point(5,i5);
    for (int i6=0;i6<=7;i6++)
    {
          Point p6 = new Point(6,i6);
    for (int i7=0;i7<=7;i7++)
    {
          Point p7 = new Point(7,i7);
    Point[] solution = new Point[] {p0,p1,p2,p3,p4,p5,p6,p7};

    printIfValidSolution(solution);

    }
    }
    }
    }
    }
    }
    }
    }


    }

    static void printIfValidSolution(Point[] solution)
    {

    if (isValidSolution(solution))
    {
    System.out.print("Solution " + (numberOfSolutions + 1) + ": ");
    numberOfSolutions++;
    for (Point piece : solution)
    {
    System.out.print("(" + piece.x + ", " + piece.y + ") ");
    }

    System.out.println();

    }
    }

    static boolean isValidSolution(Point[] solution)
    {

        //check columns and rows are all unique
        for (int i=0; i<7; i++)
        {
            for (int j=i+1; j <8; j++)
            {
                if (solution[i].sameXorY(solution[j]))
                {return false;}
            }
        }

        // check diagonals
        // 2 values are on a diagonal if the absolute numbers of rows apart are equal to the absolute columns
        for (int i=0; i<7; i++)
        {
            for (int j=i+1; j <8; j++)
            {
                if ( Math.abs(solution[i].x - solution[j].x) == Math.abs(solution[i].y - solution[j].y))
                {return false;}
            }
        }

        return true;
    }



}



class Point{
    public int x;
    public int y;

    public Point(int i, int j)
    {
    x=i;
    y=j;
    }


    public boolean sameXorY(Point p)
    {
    return (x == p.x || y == p.y);
    }


}
