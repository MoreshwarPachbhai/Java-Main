package Binary_search;

public class single_search_element_2 {

    public static void search(int[] arr){
        int n = arr.length;

        if(n == 1) System.out.println(arr[0]);

        for(int i = 0;i < n; i++){

            // check first element
            if(i == 0){
                if(arr[i] != arr[i+1]){
                    System.out.println(arr[i]);
                }
            }

            // check last element
            else if (i == n-1) {
                if(arr[i] != arr[i-1]){
                    System.out.println(arr[i]);
                }
            }

            // check middle element
            else {
                if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
                    System.out.println(arr[i]);
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,6};

        search(arr);
    }

}
