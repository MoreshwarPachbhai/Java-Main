package Strings;

public class Remove_outer_parenthesis {

    public static String removeOuterParentheses(String s){
        StringBuilder ans =new StringBuilder();
        int open =0;

        for(int i =0;i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch =='('){
                open++;
                if(open > 1){
                    ans.append(ch);
                }
            }

            else{ // closing bracket ')'
                if(open > 1){
                    ans.append(ch);
                }
                open--;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        // Test case
        String s = "(()())(())";

        // Function call
        String result = removeOuterParentheses(s);

        // Output
        System.out.println("Input  : " + s);
        System.out.println("Output : " + result);
    }
}
