package io.github.com.deysilopes.arrays;

import java.util.Arrays;

public class TwoDimensionArray {
    public static void main(String[] args) {
        // Declara
        int[][] arr2Dint;
        // Instancia
        arr2Dint = new int[2][2];
        // Inicializa
        arr2Dint[0][0] = 1;
        arr2Dint[0][1] = 2;
        arr2Dint[1][0] = 3;
        arr2Dint[1][1] = 4;

        System.out.println(Arrays.deepToString(arr2Dint));

        // Tudo junto
        String s2DArray[][]={{"a","b"},{"c","d"}};

        System.out.println(Arrays.deepToString(s2DArray));
    }
}