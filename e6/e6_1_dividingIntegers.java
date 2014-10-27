/*Create a Java class called
Calculator
. The class should implement the following methods, each of them print
ing
the result on the screen.
•
add(int, int)
•
subtract(int, int)
•
multiply(int, int)
•
divide(int, int)
•
modulus(int, int)*/

class e6_1_dividingIntegers{

    public static void main(String[] args){

    Calculator myCalc = new Calculator();
    
    System.out.println("5 op 19 is:");
    System.out.println("Add: " + myCalc.add(5, 19));
    System.out.println("Substract: " + myCalc.subtract(5, 19));
    System.out.println("Multiply: " + myCalc.multiply(5, 19));
        System.out.println("Divide: " + myCalc.divide(5, 19));
            System.out.println("Modulus: " + myCalc.modulus(5, 19));


    }

}