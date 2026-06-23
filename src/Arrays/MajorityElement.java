

// Problem Statement: Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array.
// You may consider that such an element always exists in the array.

package Arrays;
import java.util.*;
public class MajorityElement {

    public static int majority(int[] arr, int N, int mid) {

        boolean[] visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            int count = 1;
            if (visited[i]) continue;
            for (int j = i + 1; j < N; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[i] = true;
                }
            }
            if (count > mid) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2,2};
        int N = arr.length;
        int mid = N/2;

        int result = majority(arr, N, mid);
        System.out.println("The Majority element is: " + result);

        }
    }

