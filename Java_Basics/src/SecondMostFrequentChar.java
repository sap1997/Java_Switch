import java.util.*;

public class SecondMostFrequentChar {
    public static void main(String[] args) {
        String input = "aabbccc";
        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        // Step 1: Count frequency of each character
        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Extract unique frequencies and sort descending
        Set<Integer> freqSet = new HashSet<>(freqMap.values());
        List<Integer> freqList = new ArrayList<>(freqSet);
        Collections.sort(freqList, Collections.reverseOrder());

        if (freqList.size() < 2) {
            System.out.println("No second most frequent character.");
            return;
        }

        int secondHighestFreq = freqList.get(1);

        // Step 3: Find character with second highest frequency
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == secondHighestFreq) {
                System.out.println("Second most frequent character: " + entry.getKey());
                return;
            }
        }

        System.out.println("No second most frequent character found.");
    }
}
