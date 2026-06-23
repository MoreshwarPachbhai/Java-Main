// Problem Statement: Given two sorted arrays a and b of size m and n respectively.
// Find the kth element of the final sorted array.


package Binary_search;

public class kth_element_of_2_sorted_arrays {

    public static int kth_element(int[]arr1, int[]arr2, int k){
        int m = arr1.length;
        int n = arr2.length;
        int size = m+n;

        if(k <= 0 || k > size){
            return -1;
        }

        int[] temp = new int[size];

        int i =0;
        int j=0;
        int num = 0;

        while(i < m && j < n){

            if(arr1[i] < arr2[j]){
                temp[num] = arr1[i];
                i++;
                num++;
            }

            else{
                temp[num] = arr2[j];
                j++;
                num++;
            }

        }

        while(i < m){
            temp[num] = arr1[i];
            i++;
            num++;
        }

        while(j < n){
            temp[num] = arr2[j];
            j++;
            num++;
        }

        // k-1 as k is size not index
        return temp[k-1];
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};

        int k = 5;

        int result = kth_element(arr1, arr2, k);
        System.out.println("The element is: "+ result);
    }
}
