import  java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        l1.add(0,4);


        l1.remove(0);

        l1.clear();

        for(int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(" "+",");
        }


    }
}

