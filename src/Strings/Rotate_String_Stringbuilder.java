package Strings;

public class Rotate_String_Stringbuilder {

    public static boolean rotateString(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }

        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i < s.length(); i++){
            // store first character
            char first = sb.charAt(0);

            // delete first character
            sb.deleteCharAt(0);

            // add first character at end
            sb.append(first);

            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String s = "rotation";
        String goal = "tionrota";

        System.out.println(rotateString(s, goal));
    }
}
