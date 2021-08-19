public class ClosestTo10 {
    /*
    Requirement:
    Write a method findClosestTo10() that takes an int[] array as an argument, and returns the closest element to 10 from given array
    Test data 1:
    int[] numbers = {10, -13, 5, 70, 15, 57};
    Expected output 1:
    5
    Test data 2:
    int[] numbers = {10, -13, 8, 12, 15, -20};
    Expected output 2:
    8

    NOTE: You will assume that length of array is always more than zero
    NOTE: Make your code dynamic that works for any given int[] array
    NOTE: Be careful about element to be 10 (ignore it)
    NOTE: Be careful about 2 numbers to be closest ( 8 and 12) in this case return smallest which is 8

     */
    public static void main(String[] args) {
        int[] numbers = {10, -13, 8, 12, 15, -20};
        System.out.println(findClosesTo10(numbers));
    }

    public static int findClosesTo10(int[] nums){
        int closest = Integer.MIN_VALUE; // could be Integer.MAX_VALUE or zero as well
        for(int num: nums){
            if(num != 10){
                if(Math.abs(10-num) < Math.abs(10-closest)) closest = num;
                else if(Math.abs(10-num) == Math.abs(10-closest)) closest = Math.min(closest, num);
            }
        }
        return closest;
    }
}
