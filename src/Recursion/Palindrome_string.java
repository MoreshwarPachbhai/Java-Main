package Recursion;

// Problem Statement: "Given a string, check if the string is palindrome or not."
// A string is said to be palindrome if the reverse of the string is the same as the string.

import java.util.Locale;
import java.util.Scanner;

public class Palindrome_string {


    static boolean check(String str, int i , int j){

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter the string: ");
        str = sc.nextLine();

        // converting string to lower case
        str = str.toLowerCase();

        int i,j;

        i = 0;
        j = str.length()-1;

        // calling function
        boolean flag = check(str,i,j);

        if(flag){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
