
 // Problem Statement: You are the owner of a Shipment company. You use conveyor belts to ship packages from one port to another.
// The packages must be shipped within 'd' days. The weights of the packages are given in an array 'of weights'.
// The packages are loaded on the conveyor belts every day in the same order as they appear in the array.
// The loaded weights must not exceed the maximum weight capacity of the ship.
// Find out the least-weight capacity so that you can ship all the packages within 'd' days .


package Binary_search;

public class Ship_packages {

    public static int shipWithinDays(int[] weights, int days) {

        int max = getMax(weights);     // minimum possible capacity
        int sum = getSum(weights);     // maximum possible capacity

        for (int capacity = max; capacity <= sum; capacity++) {

            int dayCount = 1;
            int load = 0;

            for (int w : weights) {

                if (load + w <= capacity) {
                    load += w;          // load package on same day
                } else {
                    dayCount++;         // go to next day
                    load = w;           // start loading again
                }
            }

            if (dayCount <= days) {
                return capacity;       // smallest valid capacity found
            }
        }
        return -1;
    }

    private static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9};
        int days = 5;

        int result = shipWithinDays(weights, days);
        System.out.println("Minimum Capacity needed: " + result);
    }
}
