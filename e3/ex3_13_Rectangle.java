//Write a program that reads the X and Y coordinates of two points an
//d then outputs the area of a rectangle where
//both points are opposite corners. Use the following class to store t
//he data for the points:
//class Rectangle {
 //   Point upLeft;
 //   Point downRight;
//}
//Your program should calculate (and write on the screen) the perime
//ter and area of the rectangle.

// Question, why does a class defineid withia class need to be static?
package e3;
import java.util.Scanner;


class ex3_13_Rectangle{

    public static void main(String[] args){
        
        Point p1 = new Point();
        Point p2 = new Point();
        Scanner kb = new Scanner(System.in);
        
        // assume accurate input
        System.out.println("Please input point x of the top left coordinate");
        p1.x = kb.nextDouble();
        System.out.println("Please input point y of the top left coordinate");
        p1.y = kb.nextDouble();
        System.out.println("Please input point x of the bottom right coordinate");
        p2.x = kb.nextDouble();
        System.out.println("Please input point y of the bottom right coordinate");
        p2.y = kb.nextDouble();
        
        // not really too fussed about whether the first is the top left as using absolute values means isnt important
        Rectangle ourRect = new Rectangle(p1, p2);
        
        System.out.println("Perimiter is: " + ourRect.getPerimiter() + ", and the area is: " + ourRect.getArea());
        
    }

  }
