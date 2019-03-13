package by.bntu.fitr.povt.enotes.capitoska.model.logic;

public class Matmass {

    /**
     * @param mass
     * @return new array with replace local max on number 0
     */
    public static int[][] replaceMaxNum(int[][]mass){
        int changeMass [][] = mass;
        // проверяем элементы внутри массива
        for(int i=1;i<mass.length -1 ;i++){
            for(int k = 1;k<mass.length -1 ;k++)
            {
                if(mass[i][k]>mass[i][k+1] && mass[i][k] > mass[i][k-1] &&
                        mass[i][k] > mass[i+1][k] && mass[i][k]>mass[i-1][k]){
                    changeMass[i][k] = 0;
                }
            }
        }

        /**
         *
         * mass[1][y]
         * mass[1][0]
         * mass[y][1]
         * mass[0][1]
         *
         *
         * 1 3 3 6 7
         * 2 9 5 2 7
         * 2 8 3 3 1
         * 4 6 3 1 7
         * 9 8 1 0 3
         */
        for(int i = 1; i <mass.length-1; i++){
            if (mass[i][0] > mass[i+1][0] && mass[i][0]>mass[i-1][0] && mass[i][0] > mass[i][1]){
                changeMass[i][0] = 0;
            }
            if (mass[i][mass.length-1] > mass[i+1][mass.length-1] && mass[i][mass.length-1]>mass[i-1][mass.length-2] &&
                    mass[i][mass.length-1] > mass[i][mass.length-2]){
                changeMass[i][mass.length-1] = 0;
            }
            if (mass[0][i] > mass[0][i+1] && mass[0][i]>mass[0][i-1] && mass[0][i] > mass[1][i]){
                changeMass[0][i] = 0;
            }

            if (mass[mass.length-1][i] > mass[mass.length-1][i+1] && mass[mass.length-1][i]>mass[mass.length-2][i-1] &&
                    mass[mass.length-1][i] > mass[mass.length-2][i]){
                changeMass[mass.length-1][i] = 0;
            }

        }
        return changeMass;
    }
/*
    public static boolean isBiggestVertical(int[][] mass, int x, int y){

        return (mass[x][y] > mass[x+1][y] && mass[x][y]>mass[x-1][y] && mass[x][y] > mass[x][y+x==mass.length?-1:1]);
    }
*/

    public static boolean isSimmetrical(int [][]mass){
        for(int i=0; i<mass.length;i++){
            for(int k=0; k<mass.length;k++){
                if(mass[k][i] !=mass[i][k]){
                    return false;
                }
            }
        }
        return true;
    }

}
