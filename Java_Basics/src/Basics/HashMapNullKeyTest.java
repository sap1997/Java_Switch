package Basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapNullKeyTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "First");  // Inserts null key with "First"
        map.put(2, "Second"); // Overwrites with "Second"
        map.put(1, "First");

        System.out.println(map.size()); // Output: {null=Second}
        List<Integer> reps = Arrays.asList(4,5,6,7,8,2,4,5);
        Map<Integer,Long> result = reps.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream()
        		.filter(n->n.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(result);
        List<String> s = Arrays.asList("apple","baby","cow");
        Map<Character,Long> sres = s.toString().chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(sres);
    }
}
