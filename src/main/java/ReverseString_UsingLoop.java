public class ReverseString_UsingLoop {
    public static void main(String[] args) {
        String s = "hello";    //give any String value you want to reverse and run program

        System.out.println(reverseString(s));   //This line is to print result on the console
    }


    //Actual method that reverse the String
    public static String reverseString(String str){
        String reversedString = "";

        for(int i = str.length()-1; i >= 0; i--){
            reversedString += str.charAt(i);
        }
        return reversedString;
    }
}
