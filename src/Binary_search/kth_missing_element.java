
//  You are given a strictly increasing array ‘vec’ and a positive integer 'k'.
//  Find the 'kth' positive integer missing from 'vec'.

package Binary_search;

public class kth_missing_element {

    public static int missingElement(int[] arr, int k){

        int num = 1;
        int i =0;

        while (k > 0){
            // If num matches array element, move array pointer
            if(i < arr.length && arr[i] == num){
                i++;
            }

            // num is missing
            else{
                k--;
                if(k == 0){
                    return num;
                }
            }

            num ++;
        }

        return -1;


    }


    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;

        System.out.println(missingElement(arr, k));
    }
}
