package Arrays;

// Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.


public class Maximum_consecutive_ones {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1,0,1,1,1,1,1,1,0};
        int count = 0;
        int maxcount = 0;

        for(int i =0; i < arr.length; i++){
            if(arr[i]==1){
                count++;

                maxcount = Math.max(maxcount, count); // update max

//                if(maxcount < count){
//                    maxcount = count; // updating maxcount
//                }

            }
            else{
                count = 0; // reset the count when 0 occurs
            }
        }

        System.out.println("The maximum count of consecutive number is: "+ maxcount);


    }
}
