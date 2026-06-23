import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "India");
        map.put(2,"Australia");
        map.put(3,"Japan");

        System.out.println(map);
        System.out.println(map.get(2));

        System.out.println(map.isEmpty());

        System.out.println(map.remove(2));
        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Australia"));

    }
}
