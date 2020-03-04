public class Palindrome_String_UsingLoop {
    public static void main(String[] args) {
        //Let's see and remember what is palindrome
        //Simply, it is a word that reads the same backward as forward
        //Ex: kayak, civic, madam
        //NOTE: This method is case insensitive

        String s = "Civic"; //Give a String to test if it is palindrome or not

        System.out.println(palindrome(s));
    }

    public static Boolean palindrome(String str){
        str = str.toLowerCase();
        boolean palindrome = true;

        for(int i = 0 ; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
}
