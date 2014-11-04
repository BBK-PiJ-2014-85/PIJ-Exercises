
//Write a program that reads the X and Y coordinates of three points
//and then outputs which of the three are closer.
//Use the following class to store the data for the points:
//class Point {
 //   double x;
 //   2
 //   double y;
//}

// TODO: Should return if some are the same distance to x decimal places (due to floating point)
package e3;
import java.util.Scanner;

public class ex3_12_DistancePointToPoint {

    public static void main (String[] args){
        
        int validPoints = 0;
        Point[] points = new Point[3];
        
        Scanner kb = new Scanner(System.in);
        
        while (validPoints <3)
        {
            Point tempPoint = new Point();
            
            System.out.println("Please input point x:");
            tempPoint.x = kb.nextDouble();
            
            System.out.println("Please input point y:");
            tempPoint.y = kb.nextDouble();
        
            points[validPoints]=tempPoint;
            
            validPoints++;
        }
        
        System.out.println(points[0].x);
        
        Point closestPoint1 = points[0];
        Point closestPoint2 = points[1];
        
        double lowestDistance = distanceBetweenPoints(points[0],points[1]);
        
        if (lowestDistance > distanceBetweenPoints(points[0], points[2]) )
        {
            closestPoint2 = points[2];
            lowestDistance = distanceBetweenPoints(points[0], points[2]);
        }
        
        if (lowestDistance > distanceBetweenPoints(points[1], points[2]) )
        {
            closestPoint1 = points[1];
            closestPoint2 = points[2];
            lowestDistance = distanceBetweenPoints(points[1], points[2]);
        }
        
        System.out.println ("The closest points are (" + closestPoint1.x + ", " + closestPoint1.y + ") and ("
                            + closestPoint2.x + ", " + closestPoint2.y + ") with a distance of " + lowestDistance);
        
        
    }
    
    public static class Point
    {
        public double x, y;
    }
    
    public static double distanceBetweenPoints(Point p1, Point p2)
    {
        return Math.sqrt(Math.pow(p1.x - p2.x,2) + Math.pow(p1.y - p2.y,2));
    }

}