public class Matrix {
//attributes
   public int rows;
   public int cols;
   public int[][] elements;
// methods

    //construtor
    public Matrix(int rows, int cols, int elements[][]){
    this.rows = rows;
    this.cols = cols;
    int array[][];
    array = new int[this.rows][this.cols];
    this.elements = elements;
    }

    public void setRow(int row, int col, int value) {
        this.elements[row][col] = value;
    }
    public int getRow(int row, int col) {
        return this.elements[row][col];
    }

    public void exibir() {
        System.out.println("Array:");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.elements[i][j] + " ");
            }
            System.out.println();
        }
    }



}
