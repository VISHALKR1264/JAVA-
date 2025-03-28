// Given a string str and an integer K, the task is to find the K-th most frequent character in the string. If there are multiple characters that can account as K-th most frequent character then, print any one of them.
// Examples: 

// Step 1: Count Character Frequencies:
// Step 2: Group Characters by Frequency
// Sort Frequencies in Descending Order
// Find the K-th Most Frequent Character

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class k_th_most_freq_char {
    public static Character findKthMostFreqChar(String str, int Kth) {

        // STEP : 1
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // STEP : 2
        Map<Integer, List<Character>> mapGroup = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            mapGroup.computeIfAbsent(freq, k -> new ArrayList<>()).add(entry.getKey());
        }
        // STEP : 3
        List<Integer> Sort = new ArrayList<>(mapGroup.keySet());
        Sort.sort(Collections.reverseOrder());

        if (Kth > Sort.size()) {
            return null;
        }
        int kthfreq = Sort.get(Kth - 1);
        return mapGroup.get(kthfreq).get(0);
    }

    public static void main(String[] args) {
        String str = "GeeksforGeeks";
        int Kth = 3;

        System.out.println("K-th most frequent character: " + findKthMostFreqChar(str, Kth));

    }

}
