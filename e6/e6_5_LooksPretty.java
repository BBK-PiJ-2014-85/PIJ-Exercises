
class e6_5_LooksPretty{

    public static void main (String[] args)
    {
        Matrix2 mat1 = new Matrix2(3,3);
        mat1.setMatrix("1,2,3;0,4,5;0,0,6");
        System.out.println("Matrix is:");
        mat1.prettyPrint();
        System.out.println("This is " + (mat1.isSymmetrical() ? "" : "not ") + "symmetrical.");
        System.out.println("This is " + (mat1.isTriangular() ? "" : "not ") + "triangular.");

        Matrix2 mat2 = new Matrix2(3,3);
        mat1.setMatrix("1,2,3;2,4,5;3,5,1");
        System.out.println("Matrix is:");
        mat1.prettyPrint();
        System.out.println("This is " + (mat1.isSymmetrical() ? "" : "not ") + "symmetrical.");
        System.out.println("This is " + (mat1.isTriangular() ? "" : "not ") + "triangular.");
    }

}