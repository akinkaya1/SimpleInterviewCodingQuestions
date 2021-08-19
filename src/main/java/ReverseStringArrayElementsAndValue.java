import java.util.Arrays;

public class ReverseStringArrayElementsAndValue {

    public static void main(String[] args) {

        String[] names = {"Mike", "Alex"};

        System.out.println(Arrays.toString(reverseElementsAndValues(names)));
    }

    public static String[] reverseElementsAndValues(String[] words){
        String[] newArr = new String[words.length];

        for (int i = words.length-1; i >= 0 ; i--) {
            String newWord = "";

            for (int j = words[i].length()-1; j >= 0 ; j--) {
                newWord += words[i].charAt(j);
            }

            newArr[newArr.length-i-1] = newWord;
        }
        return newArr;
    }
}
