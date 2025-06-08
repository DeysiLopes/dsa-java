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
// Percorrer matriz
    public void percorrer2DMatriz() {
        for(int linha = 0; linha < arr.length; linha++){
            for(int col=0; col < arr[0].length; col++){
                System.out.println(arr[linha][col] +" ");
            }
            System.out.println();
        }
    }
    // Buscando a um valor dentro da matriz
    public void buscandoValor(int value){
        for(int linha=0; linha < arr.length; linha++){
            for(int col=0; col<arr[0].length; col++){
                if (arr[linha][col] == value){
                    System.out.println("O numero foi encontrado nessa linha: "+ linha + " e nessa coluna: " + col);
                    return;
                }
            }
        }
        System.out.println("O numero nao foi encontrado!");
    }

    // apagando um valor da matriz
    public void apagandoValordaMatriz(int linha, int col){
        try {
            System.out.println("Apagado com sucesso: " + arr[linha][col]);
            arr[linha][col] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("O index ẽ invalido para a amtriz!");
        }
    }
}