
// Problem Statement: You are given a positive integer n.
// Your task is to find and return its square root. If ‘n’ is not a perfect square, then return the floor value of sqrt(n).

package Binary_search;

public class Finding_sqrt {
    public static void main(String[] args) {

        int n = 36;
        int ans = 0;

        for(int i = 1; i <= n; i++){
            if(i*i <= n){
                ans = i;
            }
            else {
                break;
            }
        }

        System.out.println(ans);
    }
}
