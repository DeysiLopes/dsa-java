package io.github.com.deysilopes.arrays;

public class SingleDimensionArray {
    public int[] arr = null;

    public SingleDimensionArray(int sizeOfArry) {
        arr = new int[sizeOfArry];
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Inserido com sucesso!");
            } else {
                System.out.println("Esse campo esta ocupado!");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index do vetor invalido!");
        }
    }
// Array transversal

    public void transverseArr() {
        try {
            for (int i = 0; i< arr.length; i++) {
                System.out.println(arr[i] + " " );
            }
        } catch (Exception e ) {
            System.out.println("Array não existe mais!");
        }

    }

//    Buscando elemento em um Array

    public void searchArr(int valueTosearch) {
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == valueTosearch){
                System.out.println("Valor encontrado no index: " + i);
                return;
            }
        }
        System.out.println(valueTosearch + " não encontrado!");
    }

//    Deletar valor de um Array

    public void deleteValue(int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("Valor foi apagado com sucesso!");

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Valor inserido não está no range do array");
        }
    }
}
