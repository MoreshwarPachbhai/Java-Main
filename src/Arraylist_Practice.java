import java.util.*;

public class Arraylist_Practice {
    public static void main(String[] args) {

        // 1) Ek ArrayList<Integer> banao, 5 numbers daalo, aur unhe print karo.

     /*   ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        for(int i=0; i < arr.size(); i++){
            System.out.print(arr.get(i));
            System.out.print(" "+",");
        }
*/

        // 2) User se n numbers lo (Scanner se) aur unka sum print karo.

        /* ArrayList<Integer> arr = new ArrayList<>();
         Scanner sc = new Scanner(System.in);

         int total = 0;
         while(true){
             System.out.print("Do you want to enter a number 1.yes 2.No: ");
             int choice = sc.nextInt();

             if(choice == 1){
                 System.out.print("Enter number: ");
                 int num = sc.nextInt();

                 total += num;
             }

             else {
                 break;
             }
         }

        System.out.println("The total is: "+ total);
        */

        // 3) Ek ArrayList<Integer> banao aur sab even numbers remove kar do.

        /*
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        for(int i=0; i < arr.size();i++){
            if(arr.get(i) % 2 == 0){
                System.out.print(arr.get(i));
                System.out.print(" "+",");
            }
        }
    */



    // 4) Ek list of integers given hai, maximum number print karo.

        /*
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(5);
        arr.add(7);
        arr.add(4);

        int max = 0;

        for(int i =0; i < arr.size(); i++) {
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
        }
        System.out.println("The max number is:"+max);

    */

        // 5) Do ArrayList<String> banao (list1, list2), dono ko merge karke print karo.

        /*
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(5);
        arr1.add(6);
        arr1.add(7);
        arr1.add(8);

        System.out.println("Before Merge: "+arr);
        boolean result = arr.addAll(arr1);
        System.out.println("Added successfully: "+ result);
        System.out.println("After Merge: "+arr);

        // Reversing the list
       Collections.reverse(arr);
        System.out.println(arr);

        // checking whether it contains elements or not
        System.out.println(arr.contains(2));
    */

        // 6) Removing duplicate elements from the list
        /*
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(1);

        System.out.println("The original ist:"+arr);

        HashSet<Integer> set = new HashSet<>(arr);

        ArrayList<Integer> arr1 = new ArrayList<>(set);

        System.out.println("After removing duplicates: "+arr1);

         */

        // 7) To sort elements in arraylist
        /*
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars);
        System.out.println(cars);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(3);
        arr.add(1);
        Collections.sort(arr);
        System.out.println(arr);

         */

        // 8) To reverse the list
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(3);
        arr.add(1);

        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);






    }
}
