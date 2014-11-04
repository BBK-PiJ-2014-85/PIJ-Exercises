//Write a program that reads the coordinates of the two points defin
//ing a rectangle and then the coordinates of a
//third point. The program must then determine whether the point fa
//lls inside or outside the rectangle.

package e3;

import java.util.Scanner;

public class ex3_14_InsideOrOutside {

    public static void main(String[] args){
    
        Scanner kb = new Scanner(System.in);
        
    Rectangle myRect = new Rectangle();
    myRect.getPointsFromUser(kb);

    Point checkPoint = new Point();
        
    System.out.println("Please input point x to check is inside rectangle");
    checkPoint.x = kb.nextDouble();
    System.out.println("Please input point y to check is inside rectangle");
    checkPoint.y = kb.nextDouble();
    
        System.out.println("That point is " + (!myRect.isInside(checkPoint) ? "not " : "") + "in the rectangle");
    


    }
}

