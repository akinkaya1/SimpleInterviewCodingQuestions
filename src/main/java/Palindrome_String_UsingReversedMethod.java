public class Palindrome_String_UsingReversedMethod {
    public static void main(String[] args) {
        //Let's see and remember what is palindrome
        //Simply, it is a word that reads the same backward as forward
        //Ex: kayak, civic, madam
        //NOTE: This method is case insensitive

        String s = "Civic"; //Give a String to test if it is palindrome or not

        System.out.println(palindrome(s));
    }

    public static Boolean palindrome(String str){
        boolean palindrome;
        String reversed = "";

        for(int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }

        if(str.toLowerCase().equals(reversed.toLowerCase())){
            palindrome = true;
        }
        else{
            palindrome = false;
        }
        return palindrome;
    }
}
