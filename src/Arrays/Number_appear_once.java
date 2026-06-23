package Arrays;

// Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one.
// Find that single one.

public class Number_appear_once {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        int n = arr.length;

        int result = -1; // default in case nothing found

        boolean[] visited = new boolean[n]; // to mark already compared elements

        // Outer loop → pick one element
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;  // skip if already processed

            int count = 1;  // start count for current element and updates count = 1 for each loop

            // Inner loop → compare with rest
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark as visited
                }
            }

            // If element appears only once
            if (count == 1) {
                result = arr[i];
                break;
            }
        }

        System.out.println("The number that appears once is: " + result);
    }
}
