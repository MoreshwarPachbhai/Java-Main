package Sorting_Methods;

public class Selection_sort {
    public static void main(String[] args) {

        int[] arr = {5, 2, 3, 1, 4};

        // outer loop
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // indexes swap
                }
            }

            // swaping elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.print("Sorted array: ");
        for(int num: arr){
            System.out.print(num+" ");
        }
    }

}
