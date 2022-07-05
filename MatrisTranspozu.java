import java.util.Arrays;
import java.util.Scanner;

public class MatrisTranspozu {
    public static void main(String[] args) {
        int[][] matris = {
                {4, 6, 9},
                {1, 3, 5}
        };
        int[][] transpoze = new int[3][2];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                transpoze[j][i] = matris[i][j];
            }
        }
        for (int i= 0; i<transpoze.length; i++){
            for (int j = 0; j<transpoze[i].length; j++){
                System.out.print(transpoze[i][j]+" ");
            }
            System.out.println();
        }
    }
}

