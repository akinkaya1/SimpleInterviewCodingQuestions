public class ReverseWords_InASentence {
    public static void main(String[] args) {
        //Ex: Given sentence = Life is beautiful
        //    Expected sentence = beautiful is Life

        String s = "Life is beautiful";    //give any sentence you want to reverse and run program

        System.out.println(reverseWordsInSentence(s));   //This line is to print result on the console
    }


    //Actual method that reverse the String
    public static String reverseWordsInSentence(String str){
        String [] words = str.split(" ");
        String reversedSentence = "";

        for(int i = words.length-1; i >= 0; i--){
            reversedSentence += words[i] + " ";
        }
        return reversedSentence.trim();
    }
}
