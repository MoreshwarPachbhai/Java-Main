import java.util.*;

public class treeSet_practice {

    // TreeSet removes duplicate elements and store elements in sorted order implicitly

    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();

        // add elements
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");

        System.out.println(cars);

        // contains element
        System.out.println(cars.contains("BMW"));

        // remove element
        cars.remove("Volvo");
        System.out.println(cars);

        // finding size of set
        System.out.println(cars.size());
    }
}
