package Arrays;
// Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

import java.util.Scanner;

public class Rotate_array_by_K_elements {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;

        int [] temp = new int[n];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many positions to rotate (k): ");
        int k = sc.nextInt();

        System.out.println("Rotate Left or Right? (L/R): ");
        char direction = sc.next().toUpperCase().charAt(0);

        if(direction == 'L'){
            for(int i=0; i < n; i++){
                temp[i] = arr[(i+k)%n];
            }
            System.out.println("\nArray after Left Rotation by " + k + ":");
        } else if (direction == 'R') {
            for(int i =0; i < n; i++){
                temp[(i+k)%n] = arr[i];
            }
            System.out.println("\nArray after Right Rotation by " + k + ":");
        }
        else {
            System.out.println("Invalid choice! Please enter L or R.");
            sc.close();
            return;
        }

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
