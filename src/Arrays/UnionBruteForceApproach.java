package Arrays;

import java.util.ArrayList;
import java.util.TreeSet;

public class UnionBruteForceApproach {

    public static void main(String[] args) {

            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {1, 2, 3, 6, 7};

            TreeSet<Integer> union = new TreeSet<>();

            int i = 0, j = 0;
            int n = arr1.length, m = arr2.length;

            while (i < n && j < m) {
                // Skip duplicates in arr1
                if (i > 0 && arr1[i] == arr1[i - 1]) {
                    i++;
                    continue;
                }
                // Skip duplicates in arr2
                if (j > 0 && arr2[j] == arr2[j - 1]) {
                    j++;
                    continue;
                }

                // Compare elements
                if (arr1[i] < arr2[j]) {
                    union.add(arr1[i]);
                    i++;
                } else if (arr2[j] < arr1[i]) {
                    union.add(arr2[j]);
                    j++;
                } else {
                    // both are same
                    union.add(arr1[i]);
                    i++;
                    j++;
                }
            }

            // Copy remaining elements from arr1
            while (i < n) {
                if (i == 0 || arr1[i] != arr1[i - 1])
                    union.add(arr1[i]);
                i++;
            }

            // Copy remaining elements from arr2
            while (j < m) {
                if (j == 0 || arr2[j] != arr2[j - 1])
                    union.add(arr2[j]);
                j++;
            }

            // Print result
            System.out.println("Union of two sorted arrays: " + union);
        }
    }



