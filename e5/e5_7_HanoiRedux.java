/*he legend of the Towers of Hanoi has inspired countless variations
as mind games. Here is one of them: if we have
three posts and 64 discs, where all the even-numbered discs are o
n the leftmost post while the odd-numbered discs
are on the rightmost post, how many moves do we need to exchange
the discs following the Hanoi rules for disc
movement?
Write a method that calculates the number of moves necessary to e
xchange
n
discs.*/

import java.util.Scanner;

class e5_7_HanoiRedux{

public static void main (String[] args){

Scanner kb = new Scanner(System.in);

System.out.print("Enter an integer to calculate Hanoi Redux to: ");
int n = kb.nextInt();

if (n < 2)
{
System.out.println("Problem doesnt make sense for number less than 2.");
}
else{
System.out.println("That requires " + calcHanoiRedux(n) + " moves.");
}
}

static int calcHanoiRedux(int n)
{
if (n==2)
{
return 3;
}

return (2 * move(n)) + 1;

}

static int move(int n)
{
    if (n==3)
    {
        return 2;
    }
        return (2 * move(n-1)) + 1;
}


}