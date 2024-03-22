public class LinearAlgebra {
    private Matrix matrix1;

    private Vector vector;
    private Matrix matrix2;

    private int resultado[][];


    LinearAlgebra(Matrix matrix) {
        this.matrix1 = matrix;
    }

    LinearAlgebra(Matrix matrix1, Matrix matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public void sum() {
       if(matrix1.rows == matrix2.rows && matrix1.cols == matrix2.cols) {

           this.resultado = new int[matrix1.rows][matrix1.cols];

           for (int i = 0; i < this.matrix1.rows; i++) {

               for (int j = 0; j < this.matrix1.cols; j++) {
                   this.resultado[i][j] = this.matrix1.getRow(i, j) + this.matrix2.getRow(i, j);

               }

           }

           System.out.println("A soma das duas matrizes é: ");
           this.resultado();
       }

       else{
           System.out.println("Tamanhos diferentes, matrix não compativel");
       }


    }

    public void times(int a) {

        this.resultado = new int[matrix1.rows][matrix1.cols];

        for (int i = 0; i < this.matrix1.rows; i++) {

            for (int j = 0; j < this.matrix1.cols; j++) {
                this.resultado[i][j] = this.matrix1.getRow(i, j) * a;

            }

        }
        System.out.println("Matrix multiplicada por escalar:");
        this.resultado();

    }

    public void dot() {
        if(matrix1.cols == matrix2.rows) {
            this.resultado = new int[matrix1.rows][matrix2.cols];

            for (int i = 0; i < matrix1.rows; i++) {
                for (int j = 0; j < matrix2.cols; j++) {
                    for (int k = 0; k < matrix1.cols; k++) {
                        resultado[i][j] += matrix1.getRow(i, k) * matrix2.getRow(k, j);
                    }
                }
            }
            System.out.println("Resultado da multiplicação de matrizes:");
            for (int i = 0; i < resultado.length; i++) {
                for (int j = 0; j < resultado[i].length; j++) {
                    System.out.print(resultado[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Tamanhos imcompativeis, coluna da matrix1 = " + matrix1.cols + ",  é diferente de das linhas da matrix2 = " + matrix2.rows);
        }
    }

    public void transpose() {

        this.resultado = new int[matrix1.cols][matrix1.rows];

        for (int i = 0; i < this.matrix1.rows; i++) {
            for (int j = 0; j < this.matrix1.cols; j++) {
                this.resultado[j][i] = this.matrix1.getRow(i, j);
            }
        }
        System.out.println("Nossa matrix transpota é");
        this.resultadoTranspota();

    }

    public int getRow(int row, int col) {
        System.out.println("O valor encontrado foi");

        return this.resultado[row][col];
    }
    public int getMatrixRow(int row, int col){
        System.out.println("O valor encontrado foi");
        return matrix1.getRow(row,col);
    }
    public int getMatrix2Row(int row, int col){
        System.out.println("O valor encontrado foi");

        return matrix2.getRow(row,col);
    }
    public void resultadoTranspota() {
        for (int i = 0; i < matrix1.cols; i++) {
            for (int j = 0; j < matrix1.rows; j++) {
                System.out.print(this.getRow(i, j) + " ");

            }
            System.out.println();
        }

    }

    public void resultado() {
        for (int i = 0; i < matrix1.rows; i++) {
            for (int j = 0; j < matrix1.cols; j++) {
                System.out.print(this.getRow(i, j) + " ");

            }
            System.out.println();
        }
    }

    public void solve(double x0, double y0, double z0) {

        double a11 = matrix1.getRow(0, 0);
        double a12 = matrix1.getRow(0, 1);
        double a13 = matrix1.getRow(0, 2);
        double a21 = matrix1.getRow(1, 0);
        double a22 = matrix1.getRow(1, 1);
        double a23 = matrix1.getRow(1, 2);
        double a31 = matrix1.getRow(2, 0);
        double a32 = matrix1.getRow(2, 1);
        double a33 = matrix1.getRow(2, 2);
        double b1 = matrix1.getRow(0, 3);
        double b2 = matrix1.getRow(1, 3);
        double b3 = matrix1.getRow(2, 3);


        double xn, yn, zn;

        for (int i = 0; i < 100; i++) {
            xn = (b1 - (a12 * y0) - (a13 * z0)) / a11;
            yn = (b2 - (a21 * x0) - (a23 * z0)) / a22;
            zn = (b3 - (a31 * x0) - (a32 * y0)) / a33;

            x0 = xn;
            y0 = yn;
            z0 = zn;
        }

        System.out.println("Solução:");
        System.out.println("x = " + x0);
        System.out.println("y = " + y0);
        System.out.println("z = " + z0);
    }

    public void gauss() {
        if (matrix1.getRow(0, 0) == 0) {
            for (int i = 0; i < matrix1.cols; i++) {
                int aux;
                aux = matrix1.getRow(0, i);
                matrix1.setRow(0, i, matrix1.getRow(1, i));
                matrix1.setRow(1, i, aux);

            }
        } else if (matrix1.getRow(0, 0) == 0 && matrix1.getRow(1, 1) == 0) {
            for (int i = 0; i < matrix1.cols; i++) {
                int aux;
                aux = matrix1.getRow(0, i);
                matrix1.setRow(0, i, matrix1.getRow(1, i));
                matrix1.setRow(2, i, aux);

            }
        }


        for (int k = 0; k < matrix1.rows - 1; k++) {

            for (int i = k + 1; i < matrix1.rows; i++) {

                int factorCima = matrix1.getRow(k, k);
                int factorBaixo = matrix1.getRow(i, k);
                for (int j = k; j < matrix1.cols; j++) {
                    matrix1.setRow(i, j, matrix1.getRow(i, j) * factorCima - (factorBaixo * matrix1.getRow(k, j)));
                }


            }
        }
        System.out.println("Resultado da nossa eliminação gaussiana é");
        matrix1.exibir();
    }
}




