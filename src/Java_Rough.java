import java.util.Arrays;

public class Java_Rough {

    public static boolean canMake(int[] arr, int m, int k, int day){
        int flowers = 0;
        int bouquets = 0;

        for(int i =0; i < arr.length; i++){
            if(arr[i] <= day){
                flowers++;
                if(flowers == k){
                    bouquets++;
                    flowers=0;
                }
            }
            else{
                flowers=0;
            }
        }
        return bouquets >= m;
    }

    public static int days(int[]arr, int m, int k){

        // finding maximum days to make bouquets
        int maxdays = 0;
        for(int i =0; i < arr.length;i++){
            maxdays = Math.max(maxdays,arr[i]);
        }

        for(int day = 1; day <= maxdays; day++){
            if (canMake(arr, m, k, day)){
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
