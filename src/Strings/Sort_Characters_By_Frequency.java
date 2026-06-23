package Strings;

public class Sort_Characters_By_Frequency {


        public static void main(String[] args) {

            String s = "tree";

            // frequency array
            int[] freq = new int[26];

            // count frequency
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }

            // print characters from the highest frequency to lowest
            for (int max = s.length(); max >= 1; max--) {

                for (char ch = 'a'; ch <= 'z'; ch++) {

                    // if frequency matches current max
                    if (freq[ch - 'a'] == max) {
                        System.out.print(ch + " ");
                    }
                }
            }
        }
    }


