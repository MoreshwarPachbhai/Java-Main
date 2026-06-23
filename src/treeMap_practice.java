import java.util.*;

public class treeMap_practice {

    // TreeMap sort the data implicitly

    public static void main(String[] args) {
        TreeMap<String,String> capitalCities = new TreeMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate keys are not allowed
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        // accessing an element
        System.out.println(capitalCities.get("India"));

        // removing an element
        capitalCities.remove("Austria");
        System.out.println(capitalCities);



    }
}
