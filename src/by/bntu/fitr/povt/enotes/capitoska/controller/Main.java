package by.bntu.fitr.povt.enotes.capitoska.controller;

import by.bntu.fitr.povt.enotes.capitoska.model.entity.Matrix;
import by.bntu.fitr.povt.enotes.capitoska.model.logic.Matmass;
import by.bntu.fitr.povt.enotes.capitoska.view.Print;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 5;
        int mass[][] = new int[SIZE][SIZE];
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                mass[i][k] = 1;
            }
            mass[3][1] = 5;
            mass[0][1] = 5;
            mass[3][4] = 5;
            mass[2][0] = 5;
        }
        Matrix matrix2 = new Matrix(new int[][]{
                {8, 12, 2},
                {23, 53, 14},
                {28, 1, 87}});
        Matrix matrix3 = new Matrix(new int[][]{
                {8, 12, 2},
                {23, 53, 14},
                {28, 1, 87}});
        Matrix matrix1 = new Matrix(new int[][]{
                {3, 4, 6},
                {8, 3, 2},
                {2, 5, 9}});
        Print.printMass(mass);
        matrix2 = Matmass.replaceMaxNum(matrix1);
        System.out.println("\n\n\n\"");
        System.out.println(matrix2);

    }

}
