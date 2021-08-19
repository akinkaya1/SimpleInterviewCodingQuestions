public class RemoveExtraSpaces {
    /*
    Requirement:
    Write a method removeExtraSpaces() that takes a String as an argument, and returns a String with removed extra spaces

    Test data 1:
    String str = “   I   am      learning     Java      ”;

    Expected output 1:
    I am learning Java

    Test data 2:
    String str = “Java  is fun    ”;

    Expected output 2:
    Java is fun

    NOTE: Make your code dynamic that works for any given String
    NOTE: Be careful about empty String
    NOTE: Be careful about before and after white spaces

     */
    public static void main(String[] args) {

        System.out.println(removeExtraSpaces1(" I   am      learning     Java      "));
        System.out.println(removeExtraSpaces2("  ab    c   "));
        System.out.println(removeExtraSpaces3("   xy   z   "));
    }


    public static String removeExtraSpaces1(String str){
        if(str.trim().isEmpty()) return str;
        else{
            String[] words = str.split(" ");
            String newStr = "";

            for(String word: words){
                if(!word.isEmpty()) newStr += word + " ";
            }
            return newStr.trim();
        }
    }

    public static String removeExtraSpaces2(String str) {
        String newStr = "";
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') newStr += str.charAt(i);
            else if(str.charAt(i+1) != ' ') newStr += " ";
        }
        return newStr;
    }

    public static String removeExtraSpaces3(String str){
        return str.replaceAll("\\s+"," ").trim();
    }
}
