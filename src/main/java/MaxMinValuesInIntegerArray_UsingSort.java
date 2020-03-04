import java.util.Arrays;

public class MaxMinValuesInIntegerArray_UsingSort {
    public static void main(String[] args) {
        //In this task you will be given an array of integer
        //Ex: 5, 8, 3, -6, 0, 40, -69
        //Min = -69,   Max = 40
        //Consider Negative values as well


        int [] numbers = {5, 8, 3, -6, 0, 40, -69};

        System.out.println(maxValue(numbers));
        System.out.println(minValue(numbers));

    }

    public static int maxValue(int[] arr){
        Arrays.sort(arr);           // Sort method will return integer arr sorted from smallest to largest
        int max = arr[arr.length-1];

        return max;
    }

    public static int minValue(int[] arr){
        Arrays.sort(arr);
        int min = arr[0];

        return min;
    }
}
