public class Palindrome_Integer {
    public static void main(String[] args) {
        //Let's see and remember what is palindrome
        //Simply, it is a word that reads the same backward as forward
        //Ex: kayak, civic, madam
        //Ex of palindrome numbers: 12321, 454, 1001
        //NOTE: Negative numbers are not considered in this method

       int number = 1217; //Give a int to test if it is palindrome or not

        System.out.println(palindrome(number));
    }

    public static Boolean palindrome(int number){
        boolean palindrome;
        String num = String.valueOf(number);
        String reversedNum = "";

        for(int i = num.length()-1; i >= 0; i--){
            reversedNum += num.charAt(i);
        }

        if(num .toLowerCase().equals(reversedNum.toLowerCase())){
            palindrome = true;
        }
        else{
            palindrome = false;
        }
        return palindrome;
    }
}
