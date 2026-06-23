
// Given two sorted arrays arr1 and arr2 of size m and n respectively, return the median of the two sorted arrays.
// The median is defined as the middle value of a sorted list of numbers.
// In case the length of the list is even, the median is the average of the two middle elements.

package Binary_search;

public class Median_of_2_sortedArrays {

    public static double median(int[]arr1, int[]arr2){
        int m = arr1.length;
        int n = arr2.length;
        int size = m+n;

        int[] temp = new int[size];

        int i =0; // for arr1
        int j =0; // for arr2
        int k =0; // for temp

        while(i < m && j < n){
            if(arr1[i] < arr2[j]){
                temp[k] = arr1[i];
                i++;
                k++;
            }

            else{
                temp[k] = arr2[j];
                j++;
                k++;
            }
        }

        // if arr1 elements are left
        while(i < m){
            temp[k] = arr1[i];
            i++;
            k++;
        }

        // if arr2 elements are left
        while(j < n){
            temp[k] = arr2[j];
            j++;
            k++;
        }

        // if total array size is odd
        if(size % 2 == 1){
            return temp[size/2];
        }
        // if total array size is even
        else{
            return (temp[size / 2] + temp[(size / 2) - 1]) / 2.0;
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {2,4,6};
        int[] arr2 = {1,3,5};

        double result = median(arr1, arr2);
        System.out.println("The median of the array is: "+result);
    }
}
