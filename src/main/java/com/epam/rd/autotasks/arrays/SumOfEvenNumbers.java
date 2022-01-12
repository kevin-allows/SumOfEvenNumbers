package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        int sumOfArray = 0;
        if (array==null){
            return 0;
        }
        for (int i=0; i<array.length; i++){
            int even = array[i]%2;
            if (even == 0) {
                sumOfArray = sumOfArray + array[i];
            }
        }
        return sumOfArray;
    }
}
