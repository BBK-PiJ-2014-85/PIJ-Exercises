
/*Create a new Java class called ArrayCopier with a method called
copy
that takes two arrays of integers as param-
eters. The method should copy the elements of the first array (yo
u can call it
src
, from “source”) to the second
one (
dst
, from “destination”) as much as possible.
If the second array is smaller, then only those elements that fit will b
e copied. If the second array is larger, it
will be filled with zeroes.
Write a program that creates an object of this class and uses this m
ethod to copy some arrays in all three cases:
•
Both arrays are of the same size.
•
The source array is longer.
•
The source array is shorter.*/

class e6_2_CopyingArrays{

public static void main(String[] args)
{

int[] i1 = {3};
int[] i2 = {1,2};
int[] i3 = {3,4};
int[] i4 = {1,2,3,4};

ArrayCopier myAC = new ArrayCopier();
myAC.copy(i1,i2);
System.out.println(i2[0] + ", " + i2[1]);

myAC.copy(i2,i3);
System.out.println(i3[0] + ", " + i3[1]);

myAC.copy(i3,i4);
System.out.println(i4[0] + ", " + i4[1] + ", " + i4[2]);

}



}

