package by.bntu.fitr.povt.enotes.capitoska.controller;

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
        Print.printMass(mass);
        //mass = Matmass.replaceMaxNum(mass);
        System.out.println("\n\n\n\"");
        Print.printMass(mass);

    }

}
