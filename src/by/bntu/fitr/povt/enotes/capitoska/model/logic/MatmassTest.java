package by.bntu.fitr.povt.enotes.capitoska.model.logic;

import by.bntu.fitr.povt.enotes.capitoska.model.entity.Matrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatmassTest {
    private Matrix matrix1 = new Matrix(new int[][]{
            {3, 4, 6},
            {8, 3, 2},
            {2, 5, 9}});
    private Matrix matrix2 = new Matrix(new int[][]{
            {8, 12, 2},
            {23, 53, 14},
            {28, 1, 87}});
    private Matrix matrix1Answer = new Matrix(new int[][]{
            {3, 4, 0},
            {0, 3, 2},
            {2, 5, 0}});
    private Matrix matrix2Answwer = new Matrix((new int[][]{
            {8, 12, 2},
            {23, 0, 14},
            {0, 1, 0}}));
    private Matrix matrix3 = new Matrix(new int[][]{
            {3, 15, 21},
            {17, 53, 33},
            {14, 4, 61}});
    private Matrix matrix3Answer = new Matrix(new int[][]{
            {3, 15, 21},
            {17, 0, 33},
            {14, 4, 0}});


    @Test
    void replaceMaxNum1() {
        assertEquals(Matmass.replaceMaxNum(matrix1).toString(), matrix1Answer.toString());
    }

    @Test
    void replaceMaxNum2() {
        assertEquals(Matmass.replaceMaxNum(matrix2).toString(), matrix2Answwer.toString());
    }

    @Test
    void replaceMaxNum3() {
        assertEquals(Matmass.replaceMaxNum(matrix3).toString(), matrix3Answer.toString());
    }

    @Test
    void isBiggestVertical() {
        assertEquals(Matmass.isBiggestVertical(matrix2, 1, 0), false);
    }

    @Test
    void isBiggestVertical1() {
        assertEquals(Matmass.isBiggestVertical(matrix1, 1, 0), true);
    }

    @Test
    void isBiggestVertical2() {
        assertEquals(Matmass.isBiggestVertical(matrix3, 1, 0), false);
    }
}