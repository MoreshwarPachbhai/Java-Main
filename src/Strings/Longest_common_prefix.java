package Strings;

public class Longest_common_prefix {

    public static String longestcommonprefix(String[] strs){
        // Edge case
        if(strs == null || strs.length == 0){
            return " ";
        }

        String ref_word = strs[0];

        // Traverse each character of first string
        for(int i=0; i < ref_word.length(); i++){
            char ch = ref_word.charAt(i);

            // Compare with all other strings
            for(int j = 1; j < strs.length; j++){

                // If current string is shorter
                // OR character doesn't match
                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
                    return ref_word.substring(0, i);
                }
            }
        }
        return ref_word;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix is: "+longestcommonprefix(strs));

        String[] strs2 = {"apple", "banana", "grape", "mango"};
        System.out.println(longestcommonprefix(strs2));
    }
}
