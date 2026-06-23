package Strings;

public class Reverse_words_in_strings {

    public String reverse_string(String str){
        StringBuilder result = new StringBuilder();

        int i = str.length()-1;

        while (i  >= 0) {

            // skip spaces
            while (i >= 0 && str.charAt(i) == ' ') {
                i--;
            }

            // mark end of the word
            int end = i;

            // start of string
            while (i >= 0 && str.charAt(i) != ' ') {
                i--;
            }

            String word = str.substring(i + 1, end + 1);

            // Add space before appending if result is not empty
            if (result.length() > 0) {
                result.append(" ");
            }

            // Append word
            result.append(word);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "welcome to the jungle";

        // creating object
        Reverse_words_in_strings sol = new Reverse_words_in_strings();
        System.out.println(sol.reverse_string(str));
    }
}
