//Write a program that reads the coordinates of four point points, t
//he former two defining one rectangle and the
//latter two defining another one. The program must read the coord
//inates of a fifth point and say whether the point
//is inside both rectangles, inside one of them only, or out of both.

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
    
    class Rectangle {
        Point upLeft;
        Point downRight;
        
        public boolean isInside(Point checkPoint)
        {
            
            if (isNumberBetween (checkPoint.x, upLeft.x, downRight.x) && isNumberBetween(checkPoint.y, upLeft.y, downRight.y))
            {
                return true;
            }
            else
            {
                return false;
            }
            
        }
        
        private boolean isNumberBetween(double checkPoint, double p1, double p2)
        {
            if ( (checkPoint >= p1 && checkPoint <= p2) ||
                (checkPoint <= p1 && checkPoint >= p2))
            {
                return true;
            }
            else
            {
                return false;
            }
            
            
        }
        
        public void getPointsFromUser(Scanner kb)
        {
            Point p1 = new Point();
            Point p2 = new Point();
            
            // assume accurate input
            System.out.println("Please input point x of the top left coordinate");
            p1.x = kb.nextDouble();
            System.out.println("Please input point y of the top left coordinate");
            p1.y = kb.nextDouble();
            System.out.println("Please input point x of the bottom right coordinate");
            p2.x = kb.nextDouble();
            System.out.println("Please input point y of the bottom right coordinate");
            p2.y = kb.nextDouble();
            
            upLeft = p1;
            downRight = p2;
            
        }
        
        public double getArea()
        {
            return Math.abs(upLeft.x - downRight.x) * Math.abs(upLeft.y - downRight.y);
        }
        
        public double getPerimiter()
        {
            return 2 * (Math.abs(upLeft.x - downRight.x) + Math.abs(upLeft.y - downRight.y));
        }
        
        public Rectangle(Point p1, Point p2)
        {
            upLeft = p1;
            downRight = p2;
        }
        
        public Rectangle()
        {
        }
        
    }
    
    class Point{
        public double x,y;
    }


