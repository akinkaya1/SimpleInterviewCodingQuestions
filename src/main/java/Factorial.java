public class Factorial {
    public static void main(String[] args) {
        //Factorial is the operation of multiplying any natural number with all the natural numbers that are smaller than it
        //Ex: 4! = 4*3*2*1, so the result is 24
        //NOTE: 0! = 1
        //NOTE: Negative numbers are not considered in this method

        int number = 0;     //Give any value to find its factorial
        System.out.println(factorial(number));
    }

    public static int factorial(int number){
        int result = 1;
        for(int i = 1; i <= number; i++){
            result *= i;
        }
        return result;
    }

}
