package Recursion;

public class Print_names {

    static void print(int n) {

        if (n == 0) return;
        System.out.println("Moreshwar");
        print(n - 1);

    }

    public static void main(String[] args) {
        print(5);
    }
}
