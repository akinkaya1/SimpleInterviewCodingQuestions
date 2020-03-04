import java.util.Arrays;

public class MaxMinValuesInIntegerArray_UsingLoop {
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

        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        return max;
    }

    public static int minValue(int[] arr){

        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        return min;
    }
}
