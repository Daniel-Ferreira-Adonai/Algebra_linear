import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Array array = new Array();
        Array array1 = new Array();
        array.setArray(3, 4);
       // array1.setArray(2,4);
        Matrix matrix = new Matrix(3, 4, array.getArray());
        Matrix matrix1 = new Matrix(2,4,array1.getArray());
        matrix.exibir();
        LinearAlgebra linearAlgebra = new LinearAlgebra(matrix, matrix1);





    }
}