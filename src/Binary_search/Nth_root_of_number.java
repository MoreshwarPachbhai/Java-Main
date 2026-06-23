
// Problem Statement: Given two numbers N and M, find the Nth root of M.
// The nth root of a number M is defined as a number X when raised to the power N equals M.
// If the 'nth' root is not an integer, return -1.

package Binary_search;

public class Nth_root_of_number {

    public static int Nth_root(int n, int m) {

        int ans = -1;

        for (int i = 1; i <= m; i++) {
            double x = Math.pow(i, n);
            if (x == m) {
                ans = i;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 3;  // power
        int m = 27; // number

        int res = Nth_root(n, m);
        System.out.println("Nth Root: " + res);
    }
}
