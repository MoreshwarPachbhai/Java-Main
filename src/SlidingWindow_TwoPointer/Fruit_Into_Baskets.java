package SlidingWindow_TwoPointer;

import java.util.HashMap;

public class Fruit_Into_Baskets {

    public int totalFruit(int[] fruits) {

        // HashMap stores:
        // Key   = Fruit type
        // Value = Number of that fruit in the current window
        HashMap<Integer, Integer> map = new HashMap<>();

        // Left pointer of the sliding window
        int left = 0;

        // Stores the maximum number of fruits collected
        int max = 0;

        // Move the right pointer from left to right
        for (int right = 0; right < fruits.length; right++) {

            // Add the current fruit into the HashMap
            // If the fruit already exists, increase its count by 1
            // Otherwise, insert it with count = 1



            //map.getOrDefault(key, defaultValue) works like this:
            // If the key exists, return its current value.
            // If the key does not exist, return the default value.
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // If the window contains more than 2 fruit types,
            // shrink the window from the left
            while (map.size() > 2) {

                // Reduce the count of the leftmost fruit
                map.put(fruits[left], map.get(fruits[left]) - 1);

                // If its count becomes 0,
                // remove that fruit type completely
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                // Move the left pointer to the right
                left++;
            }

            // Calculate current window size
            int currentWindow = right - left + 1;

            // Update maximum answer
            max = Math.max(max, currentWindow);
        }

        // Return the maximum fruits collected
        return max;
    }

    // Driver Code
    public static void main(String[] args) {

        Fruit_Into_Baskets obj = new Fruit_Into_Baskets();

        int[] fruits = {1, 2, 3, 2, 2};

        int answer = obj.totalFruit(fruits);

        System.out.println("Maximum Fruits = " + answer);
    }
}
