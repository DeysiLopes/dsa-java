package io.github.com.deysilopes;

import io.github.com.deysilopes.arrays.SingleDimensionArray;
import io.github.com.deysilopes.arrays.TwoDimensionArray;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        TwoDimensionArray sda = new TwoDimensionArray(3,3);
        sda.inserindoValorNaMatriz(0,0,10);
        System.out.println(Arrays.deepToString(sda.arr));
    }
}
