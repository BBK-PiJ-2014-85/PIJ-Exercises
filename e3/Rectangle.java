package e3;

import java.util.Scanner;

public class Rectangle {
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
