package e1;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class ex1_16_RPS {
    
public static void main(String[] args) {

//firstly, check if input is a filename or a direct input
boolean inputFile = false;

String file = "/Users/Stumpy/onedrive/documents/uniwork/pij/codes/test/extra_1/extra_1/ex1_16_RPS.txt";

try
{
String[] myText = openFile(file);
inputFile=true;
int score =0; //positive for player 1, negative for player2
int c=1;
boolean formatIssue = false;
int numGames = Math.floorDiv(myText[0].length() - 2, 4) + 1;

while (!formatIssue && c<= numGames && Math.abs(score) <= 3)
{
if (c != 1 && !myText[0].substring( (c-1) * 4 - 2 ,(c-1) * 4).equals(", "))
{

formatIssue=true;
}
else
{
int outcome = RPSResult(myText[0].substring(4 * (c - 1), 4 * (c - 1) + 2));
if (outcome == -9)
{
formatIssue=true;
}
else
{
score += outcome;
}

}
c++;
}

if (formatIssue)
{
System.out.println("File Format not correct.");
}
else if (score < -3)
{
System.out.println("Player 2 wins");
}
else if (score > 3)
{
System.out.println("Player 1 wins");
}
else
{
System.out.println("Neither player has won sufficiently.");
}

}
catch (IOException e)
{
System.out.println ("File not found, please enter results by keyboard:");
Scanner kb = new Scanner(System.in);
boolean exit = false;
int score = 0;

while (!exit && Math.abs(score) <= 3)
{
System.out.println("Score is currently " + score + ". Please enter the next result or -1 to quit:");
String result = kb.next();

if (result.equals("-1"))
{
exit = true;
System.out.println("Game quit. Score was " + score + ".");
}
else if (RPSResult(result) == -9)
{
System.out.println("Result not valid. No change made.");
}
else
{
score += RPSResult(result);
}
}

if (score > 3)
{
System.out.println("Player 1 wins!");
}
else if (score < -3)
{
System.out.println("Player 2 wins!");
}


}


}

private static int RPSResult(String actions)
{

if (actions.equals("RR") || actions.equals("PP") || actions.equals("SS") )
{
return 0;
}
else if (actions.equals("RS") || actions.equals("PR") || actions.equals("SP") )
{
return 1;
}
else if (actions.equals("RP") || actions.equals("PS") || actions.equals("SR") )
{
return -1;
}
else
{
return -9;
}
}
    
    public static String[]  openFile(String path) throws IOException
    
    {
        // taken from http://www.homeandlearn.co.uk/java/read_a_textfile_in_java.html
        
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        
        int numberOfLines = countLines(path);
        String[] textData = new String[numberOfLines];
        
        int i;
        
        for (i=0; i< numberOfLines; i++)
        {
            textData[i] = textReader.readLine();
        }
        
        textReader.close();
        return textData;
    }
    
    public static int countLines(String path) throws IOException
    {
        // taken from http://www.homeandlearn.co.uk/java/read_a_textfile_in_java.html
        
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        
        String line;
        int numberOfLines = 0;
        
        while (( line = br.readLine()) != null)
        {
            numberOfLines++;
        }
        br.close();
        
        return numberOfLines;
        
    }

}
