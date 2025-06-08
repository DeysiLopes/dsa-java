package io.github.com.deysilopes;

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
        sda.inserindoValorNaMatriz(0,1,20);
        sda.inserindoValorNaMatriz(1,0,30);
        sda.inserindoValorNaMatriz(2,0,40);

        sda.buscandoValor(50);

    }
}
