package Basics;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance(); // Get instance via getInstance()
        Singleton obj1 = Singleton.getInstance(); // Get instance again

        System.out.println(obj == obj1);  // Output: true (Both refer to the same instance)
    }
}
