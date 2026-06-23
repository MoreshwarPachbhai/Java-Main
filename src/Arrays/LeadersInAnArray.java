package Arrays;

public class LeadersInAnArray {

    public static void printLeaders(int[] arr, int n){

        System.out.print("Leaders in the array: [");
        boolean firstprinted = false;

        for(int i =0; i < n; i++){
            boolean isLeader = true;

            for(int j = i+1; j < n; j++){
                if(arr[j] > arr[i]){
                    isLeader = false;
                    break;
                }
            }

            if(isLeader){
                if(firstprinted) System.out.print(",");
                System.out.print(arr[i]);
                firstprinted = true;
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        int n = arr.length;

        printLeaders(arr, n);
    }
}
