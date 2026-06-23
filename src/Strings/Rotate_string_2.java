package Strings;

public class Rotate_string_2 {

    public static boolean rotateString(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }

        String doubled = s+s;

        return doubled.contains(goal);

    }

    public static void main(String[] args) {
        String s = "rotation";
        String goal = "tionrota";

        System.out.println(rotateString(s, goal));
    }
}
