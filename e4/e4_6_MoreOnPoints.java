/*Write a program in which you create and use a class called Point, with tw
o fields of type double (e.g. x, y) and the
following methods:
distanceTo(Point):
calculates the distance to another point.
distanceToOrigin():
calculates the distance to the origin. Implement it by calling the first m
ethod.
moveTo(double x, double y):
changes the coordinates of this point to be the given parameters x
and y.
moveTo(Point):
changes the coordinates of this point to move where the given point
is.
4
clone():
returns a copy of the current point with the same coordinates.
opposite():
returns a copy of the current point with the coordinates multiplied b
y
−
1.
Two methods in a class can have the same name (identifier) as long as t
heir parameters are different. This is
called
method overloading
and we will see more of that in the future.*/
package e4;
import java.util.Scanner;

public class e4_6_MoreOnPoints{

    public static void main(String[] args){
        
        Point p1 = new Point();
        p1.x = 3;
        p1.y =4;
        
        Point p2 = new Point();
        p2.x = 6;
        p2.y = 8;
        
        System.out.println("Distance from (3,4) to (6,8) is: " + p1.distanceTo(p2) );
        System.out.println("Distance from (3,4) to origin is: " + p1.distanceToOrigin());
        
        p2.moveTo(100, 150.5);
        System.out.println("Location of second point is now: " + p2.x + " " + p2.y);
        
        p2.moveTo(p1);
        System.out.println("Location of second point is now: " + p2.x + " " + p2.y);
        
        Point p3 = p2.clone();
        System.out.println("Cloned points are " + p3.x + " & " + p3.y);
        
        Point p4 = p3.opposite();
        System.out.println("New opposite point is at " + p4.x + " & " + p4.y);
        
    }


}

class Point{

double x, y;


public double distanceTo(Point p)
    {
        return Math.pow((Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2)), 0.5);
    }

public double distanceToOrigin()
    {
        return Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);
    }

public void moveTo(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

public void moveTo(Point p)
    {
        x = p.x;
        y= p.y;
    }

public Point clone()
    {
        return this;
    }

public Point opposite()
    {
        Point temp = new Point();
        temp.x = x * -1;
        temp.y = y * -1;
        return temp;
    }

}














