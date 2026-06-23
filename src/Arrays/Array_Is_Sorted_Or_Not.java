package Arrays;

public class Array_Is_Sorted_Or_Not {
    public static void main(String[] args) {

        int[] arr = {1,2,2,4,5};

        boolean flag = true;
        int min = Integer.MIN_VALUE;

        for(int num : arr){
            if(num >= min){ // allow equal values also
                min = num;
            }
            else{
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("It is a sorted array!");
        }
        else {
            System.out.println("It is not a sorted array!");
        }
    }
}
