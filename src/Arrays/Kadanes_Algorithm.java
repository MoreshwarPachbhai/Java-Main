package Arrays;

// Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number)
// which has the largest sum and returns its sum and prints the subarray.

public class Kadanes_Algorithm {

    public static int max(int[] arr, int n, int maxsum){

        int start = 0;
        int end = 0;
        //int s = 0;

        for(int i =0; i < n; i++){
            int sum = 0;
            //s = i;

            for(int j = i; j < n; j++){
                sum += arr[j];

                if(sum > maxsum){
                    maxsum = sum;
                    //start = s;
                    start = i;
                    end = j;
                }
            }
        }

        // printing array
        System.out.print("The subarray with maximum sum is: [");
        for(int i = start; i <= end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        // returning maximum sum
        return maxsum;
    }


    public static void main(String[] args) {
        int[] arr =  {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;

        int result = max(arr, n, maxsum);

        System.out.println("The Maximum sum is: "+ result);




    }
}
