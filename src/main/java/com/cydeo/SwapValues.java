package com.cydeo;

import java.util.Arrays;

public class SwapValues {

    public static void main(String[] args) {

        //Integer[] arr = {1,2,3,4,5,6};
        String[] arr = {"a","b","c","d","f"};

        System.out.println(Arrays.toString(swap(arr,2,4)));

    }

    private static <T> T[] swap(T[] arr, int i, int i2) {

        T tmp = arr[i];
        arr[i] = arr[i2];
        arr[i2] = tmp;

        return arr;
    }
}
