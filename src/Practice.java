import SlidingWindow_TwoPointer.Fruit_Into_Baskets;

import java.util.HashMap;

public class Practice {

    public static int FruitsIntoBaskets(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;

        for(int right = 0; right < fruits.length; right++){


//map.getOrDefault(key, defaultValue) works like this:

// If the key exists, return its current value.
// If the key does not exist, return the default value.

            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);

            while(map.size() > 2){
                map.put(fruits[left], map.get(fruits[left])-1);

                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);

                }

                left++;
            }

            int current = right - left + 1;
            max= Math.max(max,current);
        }
        return max;
    }


    public static void main(String[] args) {
        int[] fruits = {1, 2, 3, 2, 2};
        System.out.println(FruitsIntoBaskets(fruits));
    }
}
