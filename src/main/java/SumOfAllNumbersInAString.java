public class SumOfAllNumbersInAString {
    public static void main(String[] args) {
        //Imagine we are given a String consist of numbers only and we want to calculate sum of all numbers present in this String
        //Ex: "23487"
        // 2+3+4+8+7 = 24    This is the result for given String number = "23487";

        String number = "23487";  //Give any number to calculate sum of numbers presented in it.
        System.out.println(sumOfNumbersInAString(number));
    }

    public static int sumOfNumbersInAString(String number){
        int sum = 0;
        for(int i = 0; i < number.length(); i ++){
            sum += Integer.valueOf(String.valueOf(number.charAt(i)));
        }

        return sum;
    }
}
