package array;

import java.util.HashMap;

public class LongestlLengthInteger {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 3, 1, 1, 1, 4, 5};
        int k = 5;
        long sum = 0;
        int maxlen = 0;
        HashMap<Long, Integer> prefixMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == k) {
                maxlen = Math.max(maxlen, i + 1);
            }
            long rem = sum - k;
            if (prefixMap.containsKey(rem)) {
                int len = i - prefixMap.get(rem);
                maxlen = Math.max(maxlen, len);
            }
            if (!prefixMap.containsKey(sum))
                prefixMap.put(sum, i);

        }
        System.out.println(" maximum length = " + maxlen);
    }
}

