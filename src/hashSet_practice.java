import java.util.*;

public class hashSet_practice {
    public static void main(String[] args) {

        // 1) Ek HashSet<Integer> banao aur 5 numbers add karo (kuch duplicate bhi).
        //Print karke dikhao ki duplicates ignore hote hain.

        /*
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(1);

        System.out.println(set);

         */


        // 2) Check karo ki koi number HashSet mein present hai ya nahi.
        /*
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(1);

        System.out.println(set.contains(1));

         */

        // 3) Kisi ek element ko remove() karke print karo updated set.
        /*
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(1);

        set.remove(3);
        System.out.println(set);

         */

        // 4) For-each loop se sab elements print karo.
        /*
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(1);

        for(int i : set){
            System.out.print(i);
            System.out.print(" "+",");

        }

         */

        // 5) Do sets ke common elements print karo.

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(1);

        System.out.println(Arrays.toString(set.toArray()));

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(4);
        set1.add(2);
        set1.add(4);
        set1.add(3);

        System.out.println(Arrays.toString(set1.toArray()));

        set.retainAll(set1);
        System.out.println(set);







    }
}
