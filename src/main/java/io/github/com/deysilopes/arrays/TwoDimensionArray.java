package io.github.com.deysilopes.arrays;

public class TwoDimensionArray {
    public int arr[][] = null;

    // Construtor
    public TwoDimensionArray(int numeroDeLinhas, int numeroDeColunas) {
        this.arr = new int[numeroDeLinhas][numeroDeColunas];
        for (int linha = 0; linha < arr.length; linha++) {
            for (int coluna = 0; coluna < arr.length; coluna++) {
                arr[linha][coluna] = Integer.MIN_VALUE;
            }
        }
    }
//    Inserindo valor na matriz

    public void inserindoValorNaMatriz(int linha, int coluna, int valor) {
        try {
            if (arr[linha][coluna] == Integer.MIN_VALUE) {
                arr[linha][coluna] = valor;
                System.out.println("Valor inserido com sucesso!");
            } else {
                System.out.println("Celula ocupada");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index invalido para uma matriz!");
        }
    }

    // acessando posicao no vetor

    public void accessCell(int linha, int col) {
        System.out.println("\nAcessando LInha#"+ linha + ", Coluna#" + col);
        try {
            System.out.println(" VAlor na posicao é: " + arr[linha][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index invalido para uma matriz!");
        }
    }
}