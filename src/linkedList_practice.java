import java.util.*;

public class linkedList_practice {
    public static void main(String[] args) {


        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        // Add First
        cars.addFirst("Mazda");
        System.out.println(cars);

        // Add Last
        cars.addLast("Honda");
        System.out.println(cars);

        // remove first
        cars.removeFirst();
        System.out.println(cars);

        // remove last
        cars.removeLast();
        System.out.println(cars);

        // get first
        System.out.println(cars.getFirst());

        // get last
        System.out.println(cars.getLast());

    }
}
