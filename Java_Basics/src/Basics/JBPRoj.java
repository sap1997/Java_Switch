package Basics;

import java.util.HashMap;
import java.util.Map;

public class JBPRoj {
    public static void main(String[] args) {
        HashMap<String, Integer> inp = new HashMap<>();

        // Adding some sample values
        inp.put("A", 1);
        inp.put("B", 2);

        for (Map.Entry m : inp.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
