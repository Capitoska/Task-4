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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return Arrays.equals(array, matrix.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
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
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lengthofRow(); i++) {
            for (int k = 0; k < lengthofColumn(); k++) {
                stringBuilder.append(array[i][k]).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
