package Sorting_Methods;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr= {5,3,2,4,1};

        for(int i =1; i < arr.length; i++){
           int key = arr[i];
           int j = i-1;

           while(j >= 0 && arr[j] > key){
               arr[j+1] = arr[j];
               j = j-1;  //  j =0-1 -> -1
           }
           arr[j+1] = key; // -1+1 -> 0
        }

        System.out.println("Sorted array: ");
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
