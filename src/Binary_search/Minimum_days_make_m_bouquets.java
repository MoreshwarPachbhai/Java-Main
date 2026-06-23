// Problem Statement: You are given 'N’ roses, and you are also given an array 'arr' where 'arr[i]' denotes that the 'ith' rose will bloom on the 'arr[i]th' day.
// You can only pick already bloomed roses that are adjacent to make a bouquet.
// You are also told that you require exactly 'k' adjacent bloomed roses to make a single bouquet.
// Find the minimum number of days required to make at least ‘m' bouquets each containing 'k' roses.
// Return -1 if it is not possible.


package Binary_search;


public class Minimum_days_make_m_bouquets {

    static boolean canMake(int[] arr, int m, int k , int day){
        int flower = 0;
        int bouquets = 0;

        for(int i=0; i < arr.length; i++){
            if(arr[i] <= day){
                flower++;

                if(flower == k){
                    bouquets++;
                    flower = 0;
                }
            }
            else {
                flower=0;
            }
        }
        return bouquets >= m;
    }



    public static int days(int[]arr, int m, int k){

        int maxday = 0;
        for(int i = 0; i < arr.length; i++){
            maxday = Math.max(maxday, arr[i]);
        }

        for(int day = 1; day <= maxday; day++){
            if(canMake(arr, m ,k, day)){
                return day;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1,10,3,10,2};
        int m =3; // bouquets
        int k=1; // roses

        int result = days(arr, m, k);
        System.out.println("Minimum days: " +result);
    }
}
