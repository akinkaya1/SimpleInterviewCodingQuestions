

public class ReverseAllWordsInString {
    public static void main(String[] args) {
        //Reverse each word separately in given String
        //Ex: Hello world wake up
        //Result: olleH dlrow ekaw pu

        String sentence = "Hello world wake up";
        System.out.println(reverseAllWordsInSentence(sentence));
    }

    public static String reverseAllWordsInSentence(String sentence){
        String [] words = sentence.split(" ");
        String result = "";
        for (String word: words) {
            for(int j = word.length()-1; j >= 0; j--){
                result += word.charAt(j);
            }
            result+= " ";
        }

        return result.trim();
    }
}
