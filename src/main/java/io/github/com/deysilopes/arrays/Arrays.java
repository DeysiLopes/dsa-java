package io.github.com.deysilopes.arrays;

public class Arrays {
    public static void main( String[] args )
    {
        int[] intArray;
        intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        System.out.println(java.util.Arrays.toString(intArray));

        String[] sArray = {"a","b","c"};
        System.out.println(java.util.Arrays.toString(sArray));
    }
}
