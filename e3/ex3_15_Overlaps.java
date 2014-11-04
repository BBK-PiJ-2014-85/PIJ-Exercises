//Write a program that reads the coordinates of four point points, t
//he former two defining one rectangle and the
//latter two defining another one. The program must read the coord
//inates of a fifth point and say whether the point
//is inside both rectangles, inside one of them only, or out of both.

package e3;

import java.util.Scanner;

public class ex3_15_Overlaps{

    public static void main(String[] args){
       
        Scanner kb = new Scanner(System.in);
        
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1:");
        rect1.getPointsFromUser(kb);
        
        Rectangle rect2 = new Rectangle();
        System.out.println("Rectangle 2:");
        rect2.getPointsFromUser(kb);
        
        Point checkPoint = new Point();
        
        System.out.println("Please input point x to check is inside rectangles");
        checkPoint.x = kb.nextDouble();
        System.out.println("Please input point y to check is inside rectangles");
        checkPoint.y = kb.nextDouble();
        
        int numberInside = (rect1.isInside(checkPoint) ? 1 : 0 ) + (rect2.isInside(checkPoint) ? 1 : 0);
        
        System.out.println("That point is inside " + numberInside + " rectangles");
        
    }
}
    



