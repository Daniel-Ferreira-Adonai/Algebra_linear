public class Vector {

    //attributes
    private int dim;
    private int[] elements;

    // constructor
    public Vector(int dim, int[] elements) {
        this.dim = dim;
        this.elements = elements;
    }

    // methods
    public void exibir() {
        for (int i = 0; i < this.dim; i++) {
            System.out.println();
        }
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }


    public int[] getElements() {
        return elements;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }
}