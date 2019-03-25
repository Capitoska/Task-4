package by.bntu.fitr.povt.enotes.capitoska.view;

public class Print {
    public static void printMass(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int k = 0; k < mass.length; k++) {
                System.out.print(mass[i][k]);
            }
            System.out.println();
        }
    }
}
