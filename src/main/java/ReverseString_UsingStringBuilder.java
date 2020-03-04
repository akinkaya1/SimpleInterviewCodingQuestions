public class ReverseString_UsingStringBuilder {
    public static void main(String[] args) {
        String s = "hello";    //give any String value you want to reverse and run program

        System.out.println(reverseString(s));   //This line is to print result on the console
    }

    public static String reverseString(String str){
        String reversedString;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        reversedString = sb.reverse().toString(); //StringBuilder has a reverse method that reverse the whatever value it has

        return reversedString;
    }


}
