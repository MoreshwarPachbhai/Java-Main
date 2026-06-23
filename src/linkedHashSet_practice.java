import java.util.*;

public class linkedHashSet_practice {
    public static void main(String[] args) {
        LinkedHashSet<String> cars = new LinkedHashSet<>();

        // add elements
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");

        System.out.println(cars);

        // contains element or not
        System.out.println(cars.contains("Honda"));

        // remove elements
        cars.remove("Volvo");
        System.out.println(cars);

        // finding size
        System.out.println(cars.size());

        // for each loop
        for(String i : cars){
            System.out.println(i);
        }
    }
}
