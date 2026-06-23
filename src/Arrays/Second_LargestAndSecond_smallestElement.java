package Arrays;

public class Second_LargestAndSecond_smallestElement {
    public static void main(String[] args) {
        int[] arr = {4,6,3,8,9,2,5,1};

        int Max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int Min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        // finding second largest
        for(int num : arr){
            if(num > Max){
                secondMax = Max;
                Max = num;
            } else if (num > secondMax && num != Max) {
                secondMax = num;
            }
        }

        // finding second smallest
        for(int num : arr){
            if(num < Min){
                secondMin = Min;
                Min = num;
            } else if (num < secondMin && num != Min) {
                secondMin = num;
            }
        }

        if(secondMax == Integer.MIN_VALUE || secondMin == Integer.MAX_VALUE){
            System.out.println("-1");
        }
        else{
            System.out.println("Second largest Element: "+ secondMax);
            System.out.println("Second Smallest Element: "+ secondMin);
        }
    }
}
