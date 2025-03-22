package io.github.com.deysilopes;

import io.github.com.deysilopes.arrays.SingleDimensionArray;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0,10);
        sda.insert(1,20);
        sda.insert(2,30);
//        sda.insert(1,30);
//        sda.insert(12,120);
//        int firtElement = sda.arr[0];
//        System.out.println(firtElement);
//        int thirdElement = sda.arr[3];
//        System.out.println(thirdElement);
//        System.out.println("Array transversal");
//        sda.transverseArr();
        sda.searchArr(10);
    }
}
