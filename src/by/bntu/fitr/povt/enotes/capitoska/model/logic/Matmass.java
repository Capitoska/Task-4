package by.bntu.fitr.povt.enotes.capitoska.model.logic;

import by.bntu.fitr.povt.enotes.capitoska.model.entity.Matrix;

public class Matmass {

    /**
     * @param matrix
     * @return new array with replace local max on number 0
     */
    public final static int REPLACED_NUMBER = 0;

    public static Matrix replaceMaxNum(Matrix matrix) {
        Matrix changeMatrix = new Matrix(matrix);
        // проверяем элементы внутри массива
        for (int i = 1; i < matrix.lengthofRow() - 1; i++) {
            for (int k = 1; k < matrix.lengthofColumn() - 1; k++) {
                if (matrix.getElement(i, k) > matrix.getElement(i, k + 1) &&
                        matrix.getElement(i, k) > matrix.getElement(i, k - 1) &&
                        matrix.getElement(i, k) > matrix.getElement(i + 1, k) &&
                        matrix.getElement(i, k) > matrix.getElement(i - 1, k)) {
                    changeMatrix.setElement(REPLACED_NUMBER, i, k);
                }
            }
        }


        for (int i = 1; i < matrix.lengthofRow() - 1; i++) {
            if (isBiggestVertical(matrix, i, 0)) {
                changeMatrix.setElement(REPLACED_NUMBER, i, 0);
            }

            if (isBiggestVertical(matrix, i, matrix.lengthofColumn() - 1)) {
                changeMatrix.setElement(REPLACED_NUMBER, i, matrix.lengthofColumn() - 1);
            }

            if (matrix.getElement(0, i) > matrix.getElement(0, i + 1) &&
                    matrix.getElement(0, i) > matrix.getElement(0, i - 1) &&
                    matrix.getElement(0, i) > matrix.getElement(1, i)) {
                changeMatrix.setElement(REPLACED_NUMBER, 0, i);
            }

            if (matrix.getElement(matrix.lengthofRow() - 1, i) > matrix.getElement(matrix.lengthofRow() - 1,
                    i + 1) &&
                    matrix.getElement(matrix.lengthofRow() - 1, i) > matrix.getElement(matrix.lengthofRow() - 2,
                            i - 1) &&
                    matrix.getElement(matrix.lengthofRow() - 1, i) > matrix.getElement(matrix.lengthofRow() - 2,
                            i)) {
                changeMatrix.setElement(REPLACED_NUMBER, matrix.lengthofRow() - 1, i);
            }

           /* if (mass[mass.length - 1][i] > mass[mass.length - 1][i + 1] && mass[mass.length - 1][i] > mass[mass.length - 2][i - 1] &&
                    mass[mass.length - 1][i] > mass[mass.length - 2][i]) {
                changeMass[mass.length - 1][i] = 0;
            }
            */


        }
        return changeMatrix;
    }

    public static boolean isBiggestVertical(Matrix matrix, int row, int column) {

        return (matrix.getElement(row, column) > matrix.getElement(row + 1, column) &&
                matrix.getElement(row, column) > matrix.getElement(row - 1, column) &&
                matrix.getElement(row, column) > matrix.getElement(row, column + row == matrix.lengthofRow() ? -1 : 1));
        //mass[x][y + x == mass.length ? -1 : 1]);
    }

    public static boolean isSimmetrical(Matrix matrix) {
        for (int i = 0; i < matrix.lengthofRow(); i++) {
            for (int k = 0; k < matrix.lengthofColumn(); k++) {
                if (matrix.getElement(k, i) != matrix.getElement(i, k)) {
                    return false;
                }
            }
        }
        return true;
    }

}
