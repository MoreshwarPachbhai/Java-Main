package Hashing;

// Problem Statement: Given an array of size N. Find the highest and lowest frequency element.

public class HighestAndLowest_frequency_element {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 40, 50, 10, 50, 60, 60};
        boolean[] visited = new boolean[arr.length];

        int maxfre = Integer.MIN_VALUE;
        int minfre = Integer.MAX_VALUE;

        int maxelement = 0;
        int minelement = -1;

        for(int i=0; i < arr.length; i++){
            if(visited[i]) continue;

            int count = 1;
            for(int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");

            // calculating max frequency
            if(count > maxfre){
                maxfre = count;
                maxelement = arr[i];
            }

            // calculating min frequency
            if(count < minfre){
                minfre = count;
                minelement = arr[i];
            }

        }

        System.out.println("Element with Highest Frequency: " + maxelement + " (Count: " + maxfre + ")");
        System.out.println("Element with Lowest Frequency: " + minelement + " (Count: " + minfre + ")");

    }
}
