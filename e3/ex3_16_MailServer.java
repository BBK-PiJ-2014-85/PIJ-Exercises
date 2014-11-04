/* Let’s implements part of a mail server. A mail server is a program tha
t takes your emails and then sends them to
the appropriate recipient. In this exercise, you will implement a simplifi
ed version of the SMTP protocol that is
used to send emails over the Internet.
When your program starts, it should provide a command prompt to t
he user. Then it must read the return
address of the email using a command of the form “MAIL FROM:
<
email-address
>
”. The program must check
that the command is properly written and that the email address is v
alid (i.e. contains one and only one “@” sign
which is neither the first nor the last character). There is no need f
or the email address to actually exist, it only
needs to be valid. If there is an error, the program must say so and
wait for a correct return address.
Once the destination is correct, the program must say “OK” and wa
it for the recipient. The recipient must be
introduced by the user with a command of the form “RCPT FROM:
<
email-address
>
”. Once again, if the user
enters an invalid command or email address, the program must wait f
or a correct one.
Once the return address and recipient are correct, and only then
, the user can enter the command “DATA”.
The program reads then the body of the email, line after line, until th
e user enters a line that consists of only a dot.
At that point, the email is ready and the program must write on the s
creen who is sending the email, to whom,
and what the email says.
If at any point the users types “QUIT” the program must terminat
e. If the user enters any other command,
or types one of these commands at the wrong time (e.g. RCPT befor
e MAIL), the program must say “Invalid
command” on screen. See a simple example below */
package e3;
import java.util.Scanner;

public class ex3_16_MailServer{
    
    public static void main(String[] args) {

        
        System.out.println("Welcome to My Mail Server");
        Scanner kb = new Scanner (System.in);
      //  String line = kb.nextLine();
        boolean quit = false, completed = false;
        String emailFrom ="", emailTo = "", message="";
        
        while (!quit && !completed)
        {
            String input = kb.nextLine();

            if (input.length() >= 4 && input.substring(0,4).equals("QUIT"))
            {
                quit = true;
                System.out.println("Program aborted");
            }
            else if (emailFrom == "")
            { //assume user enters on first block (i.e. no leading spaces
                if (input.length() >= 10 && input.substring(0,10).equals("MAIL FROM:"))
                {
                    if (isValidEmail(input.substring(10)))
                    {
                        emailFrom = input.substring(10);
                        System.out.println("OK");
                    }
                    else
                    {
                        System.out.println("Invalid email address.");
                    }
            
                }
                else
                {
                    System.out.println("Invalid command.");
                }
            }
            else if (emailTo == "")
            {
                if (input.length() >= 8 && input.substring(0,8).equals("RCPT TO:"))
                {
                    if (isValidEmail(input.substring(8)))
                    {
                        emailTo = input.substring(8);
                        System.out.println("OK");
                    }
                    else
                    {
                        System.out.println("Invalid email address.");
                    }
                }
                else
                {
                    System.out.println("Invalid command.");
                }
            }
            else if (input.length() >= 4 &&input.substring(0,4).equals("DATA"))
            {
                while (!completed)
                {
                    input = kb.nextLine();
                    if (input.equals(".")) {completed = true;}
                    else {message += input + "\n";}
                }
            }
            else
            {
                System.out.println("Invalid command.");
            }
        }
        
        System.out.println("Sending Email...");
        System.out.println("from: " + emailFrom);
        System.out.println("to: " + emailTo);
        System.out.println(message);
        System.out.println(".. done!");
    }
    
    private static boolean isValidEmail(String email)
    {
        int atCount = 0;
        boolean valid = true;
        for (int i = 0; i < email.length(); i++)
        {
            if ( (i == 0 || i == email.length() - 1) && email.charAt(i) == '@')
            {
                valid = false;
            }
            else if (email.charAt(i) == '@')
            {
                atCount++;
            }
        }
        
        if ( atCount == 1 && valid && email.length() >2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}





















