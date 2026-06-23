package Strings;

public class Rotate_String {

    public static boolean rotateString(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }

        String temp = s;

        for(int i =0; i < s.length(); i++){
            temp = temp.substring(1) + temp.charAt(0);

            if(temp.equals(goal)){
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
