package by.bntu.fitr.povt.enotes.capitoska.model.entity;

import java.util.Arrays;

public class Matrix {
    public final static int DEFAULT_SIZE = 5;

    private int[][] array;

    public Matrix(int[][] array) {
        this.array = array;
    }

    public Matrix(int lengthRow, int lengthColumn) {
        this.array = new int[lengthRow][lengthColumn];
    }

    public Matrix() {
        this(DEFAULT_SIZE, DEFAULT_SIZE);
    }

    public Matrix(Matrix matrix) {
        this(matrix.array.length, matrix.array[0].length);

        for (int i = 0; i < matrix.array.length; i++) {
            for (int j = 0; j < matrix.array[0].length; j++) {
                this.array[i][j] = matrix.array[i][j];
            }
        }
    }

    public void setElement(int value, int row, int column) {
        this.array[row][column] = value;
    }

    public int getElement(int row, int column) {
        return array[row][column];
    }

    public int lengthofRow() {
        return this.array[0].length;
    }

    public int lengthofColumn() {
        return this.array.length;
    }

    @Override
    public String toString() {
        return "Matrix{\n" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
