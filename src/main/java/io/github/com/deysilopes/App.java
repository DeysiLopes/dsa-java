package io.github.com.deysilopes;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Scanner console = new Scanner(System.in);
        System.out.println("Quantos dias serão inseridos para o calculo de media? ");
        int numDias = console.nextInt();
        int [] temps = new int[numDias];
        // armazenar temps e achar média
        int sum = 0;
        for (int i=0; i<numDias; i++){
            System.out.println("Dia " + (i+1) + " mãxima temperatura: ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }

        double media = sum / numDias;
        // conta dias acima da temperatura
        int acima = 0;
        for (int i=0; i< temps.length; i++){
            if (temps[i]>media){
                acima++;
            }
        }
        System.out.println();
        System.out.println("A temperatura media é: " + media);
        System.out.println(acima + " Dias acima da temperatura! ");
    }
}
