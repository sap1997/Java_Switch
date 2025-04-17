package Basics;

public class Singleton {
    // Private static instance variable
    private static volatile Singleton single_instance;

    // Private constructor to prevent direct instantiation
    private Singleton() {  
    }

    // Public static method to provide a single instance (Thread-safe using Double-Checked Locking)
    public static Singleton getInstance() {
        if (single_instance == null) { // First check (no locking)
            synchronized (Singleton.class) {
                if (single_instance == null) { // Second check (inside synchronized block)
                    single_instance = new Singleton();
                }
            }
        }
        return single_instance;
    }
}
