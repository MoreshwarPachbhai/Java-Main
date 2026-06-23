package Strings;

import java.util.HashMap;

public class Isomorphic_String {

    public static boolean isIsomorphic(String s, String t ){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(mapST.containsKey(c1)){
                if(mapST.get(c1) != c2){  // (p -> t) i.e (t -> t) when next iteration checks
                    return false;
                }
            }

            else{
                if(mapTS.containsKey(c2)){ // a -> a
                    return false;          //  b -> a
                }

                mapST.put(c1, c2); // here p -> t first when both p and t are not present in HashMap
                mapTS.put(c2, c1);
            }
        }


        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("ab", "aa"));
    }
}
