package SlidingWindow_TwoPointer;

import java.util.ArrayList;

public class Length_of_Longest_Substring {

    public static int longestSubstring(String s){
        ArrayList<Character> list = new ArrayList<>();
        int max_len = 0;

        for(int i =0; i < s.length(); i++){

            while(list.contains(s.charAt(i))){
                list.remove(0);
            }

            list.add(s.charAt(i));

            if(list.size() > max_len){
                max_len = list.size();
            }
        }

        return max_len;
    }


    public static void main(String[] args) {
        String s = "abcddabac";

        int result = longestSubstring(s);

        System.out.println("Length of Longest Substring = " + result);
    }
}
