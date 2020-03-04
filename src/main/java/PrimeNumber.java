public class PrimeNumber {
    public static void main(String[] args) {
        //Prime number is a number that can be divided only by 1 and itself
        //So, sum of dividing numbers for a prime number MUST BE 2 only
        //Negative numbers can't be prime number
        //Smallest prime number is 2
        //Ex: 2,3,5,7,11,13,17,19

        int number = 65; // Give any number to check whether it is prime or not
        System.out.println(primeNumber(number));
    }

    public static Boolean primeNumber(int number){
        boolean primeNumber;
        int sumOfDividingNumbers = 0;
        for (int i = 1; i <= number; i++){
            if(number % i == 0){
                sumOfDividingNumbers+=1;
            }
        }
        if(sumOfDividingNumbers == 2){
            primeNumber = true;
        }
        else{
            primeNumber = false;
        }
        return primeNumber;
    }
}
