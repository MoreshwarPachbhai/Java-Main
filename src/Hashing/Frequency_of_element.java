package Hashing;

// Problem statement: Given an array, we have found the number of occurrences of each element in the array.

public class Frequency_of_element {
    public static void main(String[] args) {

        int[] arr = {10,20,10,40,50,40,30,60,90};
        boolean [] visited = new boolean[arr.length];

        for(int i =0; i < arr.length; i++){
            if(visited[i]) continue;
            int count = 1; // reset count when loop starts at each time
            for(int j=i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}
