
import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(1); //duplicates ignored krta hai
        System.out.println(hash);

        System.out.println(Arrays.toString(hash.toArray()));

        System.out.println(hash.isEmpty());
        System.out.println(hash.remove(1));
        System.out.println(hash);

        System.out.println(hash.iterator());


    }
}
