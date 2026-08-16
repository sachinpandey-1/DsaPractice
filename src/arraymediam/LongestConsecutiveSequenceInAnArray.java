package arraymediam;

import java.util.HashSet;

public class LongestConsecutiveSequenceInAnArray {
    public static void main(String[] args) {
        int[] arr = {99, -2, -4, 100, -1, 0,-3};
        HashSet<Integer> set = new HashSet<>();
        int maxlength = 0;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (!set.contains(arr[i] - 1)) {
                int count = 1;
                while (set.contains(current + 1)) {
                    current++;
                    count++;

                    if (count > maxlength) {
                        maxlength = count;
                    }
                }
            }
        }
        System.out.println(maxlength);
    }
}