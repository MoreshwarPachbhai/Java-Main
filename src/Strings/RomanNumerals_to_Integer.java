package Strings;

import java.util.HashMap;

public interface RomanNumerals_to_Integer {

    public static int romanToInt(String s){

        HashMap<Character, Integer> map= new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        for(int i=0; i < s.length(); i++){
            int current = map.get(s.charAt(i));

            // checking if next element exists
            if(i+1 < s.length()){
                int next = map.get(s.charAt(i+1));

                if(current < next){
                    total = total - current;
                }
                else {
                    total = total + current;
                }
            }

            else {
                total= total + current;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String s = "LVIII";

        System.out.println(romanToInt(s));
    }
}
