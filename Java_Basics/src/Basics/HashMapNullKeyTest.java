package Basics;

import java.util.HashMap;

public class HashMapNullKeyTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "First");  // Inserts null key with "First"
        map.put(2, "Second"); // Overwrites with "Second"
        map.put(1, "First");

        System.out.println(map.size()); // Output: {null=Second}
    }
}
