package Strings;

public class Sum_of_Beauty_of_all_substring {

    public static int beautySum(String s){
        int totalBeauty = 0;

        // Pick starting index
        for (int i = 0; i < s.length(); i++) {

            // Frequency array for characters
            int[] freq = new int[26];

            // Expand substring
            for (int j = i; j < s.length(); j++) {

                // Current character
                char ch = s.charAt(j);

                // Increase frequency
                freq[ch - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                // Find max and min frequency
                for (int k = 0; k < 26; k++) {

                    if (freq[k] > 0) {

                        maxFreq = Math.max(maxFreq, freq[k]);

                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }

                // Add beauty of current substring
                totalBeauty += (maxFreq - minFreq);
            }
        }

        return totalBeauty;
    }


    public static void main(String[] args) {
        String s = "xyx";

        System.out.println(beautySum(s));
    }
}
