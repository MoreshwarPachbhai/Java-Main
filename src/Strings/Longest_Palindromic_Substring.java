package Strings;

public class Longest_Palindromic_Substring {

    public static String longestPalindrome(String s){
        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            String odd = expand(s, i, i);

            // Even length palindrome
            String even = expand(s, i, i + 1);

            // Compare with current answer
            if (odd.length() > ans.length()) {
                ans = odd;
            }

            if (even.length() > ans.length()) {
                ans = even;
            }
        }

        return ans;
    }

    public static String expand(String s, int left, int right){
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }

    public static void main(String[] args) {
        String s = "babad";

        System.out.println(longestPalindrome(s));
    }
}
