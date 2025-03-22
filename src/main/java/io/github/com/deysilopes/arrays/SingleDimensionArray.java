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

}
