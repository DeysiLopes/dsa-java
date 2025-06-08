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
        int sum = 0;
        for (int i=1; i<=numDias; i++){
            System.out.println("Dia " + i + " mãxima temperatura: ");
            int next = console.nextInt();
            sum += next;
        }

        double media = sum / numDias;
        System.out.println();
        System.out.println("A temperatura media é: " + media);
    }
}
