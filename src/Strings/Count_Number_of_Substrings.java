package Strings;

import java.util.HashSet;

public class Count_Number_of_Substrings {

    public static int countSubstrings(String s, int k) {

            int count = 0;

            // starting point
            for (int i = 0; i < s.length(); i++) {

                // Hashset ignores duplicate elements
                // Hashset is present in outer loop so for each iteration of outer loop a new Hashset is created
                HashSet<Character> set = new HashSet<>();

                // Inner loop to store unique characters in Hashset
                for (int j = i; j < s.length(); j++) {

                    // current character add
                    set.add(s.charAt(j));

                    // exactly k distinct characters
                    if (set.size() == k) {
                        count++;
                    }

                    // more than k distinct
                    else if (set.size() > k) {
                        break;
                    }
                }
            }

            return count;
        }
    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;

        System.out.println(countSubstrings(s, k));
    }
}
