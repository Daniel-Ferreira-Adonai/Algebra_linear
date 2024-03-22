import java.util.Scanner;
//pedro bikes esteve aqui!!!
public class Array {
    //attributes
    private int array[][];
    private int rows;
    private int cols;

    //methods


    public void setArray(int rows, int cols){
        Scanner entrada = new Scanner(System.in);

        this.array = new int[rows][cols];
        System.out.println("Insira o valor da Matrix");
        for(int i = 0; i < rows ; i++) {

            for(int j = 0; j < cols ; j++){
                System.out.println("a" + (i + 1)  + (j + 1));
                this.array[i][j] = entrada.nextInt();
            }


        }
    }

    public int[][] getArray() {
        return array;
    }
    public void setPredefinedArray4x4(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10, int num11, int num12, int num13, int num14, int num15, int num16) {
        this.array = new int[][] {
                {num1, num2, num3, num4},
                {num5, num6, num7, num8},
                {num9, num10, num11, num12},
                {num13, num14, num15, num16}
        };
    }
    public void setPredefinedArray3x3(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9) {
        this.array = new int[][] {
                {num1, num2, num3},
                {num4, num5, num6},
                {num7, num8, num9}

        };
    }
    public void setPredefinedArray2x2(int num1, int num2, int num3, int num4) {
        this.array = new int[][] {
                {num1, num2,},
                {num3, num4,}

        };
    }
    public void setPredefinedArray1x1(int num1) {
        this.array = new int[][] {
                {num1}

        };
    }
}
