public class FibonacciSeries {
    public static void main(String[] args) {
        // DEFINITION: a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.
        // The simplest is the series 0, 1, 1, 2, 3, 5, 8, 13, 21

        int number = 6; //Give any number to get series of fibonacci
                        //this will return 0, 1, 1, 2, 3, 5 because I give 4 and it should return first 4 number of fibonacci series

        System.out.println(fibonacciSeries(number));

    }

    public static String fibonacciSeries(int number){
        int zero = 0;
        int one = 1;
        int sum;
        String fibonacciSeries = "";

        for(int i = 0; i < number; i++){
            fibonacciSeries += zero + " ";
            sum = zero + one;
            zero = one;
            one = sum;
        }
        return fibonacciSeries.trim();
    }
}
