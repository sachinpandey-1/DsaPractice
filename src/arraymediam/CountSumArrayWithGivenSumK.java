package arraymediam;

import java.util.HashMap;

public class CountSumArrayWithGivenSumK {
    public static int findAllSubarraysWithGivenSum(int[] arr, int k) {
        // Map to store (prefixSum, count)
        HashMap<Integer, Integer> map = new HashMap<>();

        // Base case: a prefix sum of 0 hrras occued once
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            // Add current element to prefix sum
            prefixSum += arr[i];

            // If (prefixSum - k) exists in map, it means a subarray with sum k exists
            int remove = prefixSum - k;
            if (map.containsKey(remove)) {
                count += map.get(remove);
            }

            // Update the count of current prefix sum in the map
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -2};
        int k = 3;
        System.out.println("Total subarrays: " + findAllSubarraysWithGivenSum(arr, k));
    }
}




