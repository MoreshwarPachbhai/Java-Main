import java.util.*;

public class hashMap_practice {
    public static void main(String[] args) {

        // 1) Ek HashMap<Integer, String> banao jisme roll number → student name ho.
        //3 entries add karo aur print karo.

        /*
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "yash");
        map.put(2, "Darshan");
        map.put(3,"Anuj");

        System.out.print(map);

         */


        // 2) Check karo ki koi particular key map mein hai ya nahi.
        /*
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "yash");
        map.put(2, "Darshan");
        map.put(3,"Anuj");

        System.out.print(map.containsKey(1));

         */


        // 3) Kisi ek key ko remove karke updated map print karo.
        /*
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "yash");
        map.put(2, "Darshan");
        map.put(3,"Anuj");
        System.out.println("original list: "+map);

        map.remove(1);
        System.out.println("After removal: "+ map);

         */


        // 4) 2️⃣ Get Value by Key
        //
        //Problem:
        //User se ek key input lo aur uske corresponding value print karo.

        /*
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "yash");
        map.put(2, "Darshan");
        map.put(3,"Anuj");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key: ");
        int key = sc.nextInt();

        String value = map.get(key);

        if(value != null)
        {
            System.out.println("The corresponding value of key is: "+ value);
        }
        else {
            System.out.println("Key not found");
        }

         */


        // 5) using for each loop

        HashMap<String,String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate keys are not allowed but values can
        capitalCities.put("USA", "Washington DC");

        // for each loop to print keys
        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }

        // for each loop to print values
        for (String j : capitalCities.values()){
            System.out.println(j);
        }

        // for each loop to print keys as well as values
        for (String n : capitalCities.keySet()){
            System.out.println("Key: "+ n +" Values: "+ capitalCities.get(n));
        }




    }
}
