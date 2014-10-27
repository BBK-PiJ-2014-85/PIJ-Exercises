

class e6_3_CreatingMatrices{

    public static void main (String[] args){
    
    Matrix m = new Matrix(5,5);
    
    m.setRow(0,"1,2,3,4,5");
    m.setRow(1,"4,5,6,7,8");
    m.setRow(2,"7,8,9,10,11");
    m.setRow(2,"7,8,9,10,11");
    m.setRow(2,"7,8,9,10,11");
    m.setRow(2,"-1,-1,-1");
    m.setColumn(0,"2,2,2,2,2");
   // System.out.println(m.toString());
    m.prettyPrint();

    System.out.println();
    m.setRow(2,"7,8,900000000,10,11");
    // not so pretty print... doesnt act well with integers 10 digits long.
    m.prettyPrint();
    
    
    }
}