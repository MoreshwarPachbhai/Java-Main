package Strings;

public class Largest_odd {

    public static String largestodd(String s) {

        int n = s.length();

        // Skip leading zeros
        int start = 0;

        while(start < n && s.charAt(start) == '0') {
            start++;
        }

        // Find rightmost odd digit
        for(int i = n - 1; i >= start; i--) {

            char ch = s.charAt(i);

            if((ch - '0') % 2 != 0) {
                return s.substring(start, i + 1);
            }
        }

        return "";
    }

    public static void main(String[] args) {

        String s = "005347";

        System.out.println(largestodd(s));
    }
}