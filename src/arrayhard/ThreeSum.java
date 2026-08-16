package arrayhard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
   static int [] arr = {-1,0,1,2,-1,-4};
    public static List<List<Integer>> sum(int[] arr) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i>0 && arr[i]== arr[i-1]){
                continue;
            }
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int total = arr[i] + arr[left] + arr[right];
                if (total < 0) {
                    left++;
                } else if (total > 0) {
                    right--;
                } else {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[left]);
                    triplet.add(arr[right]);
                    answer.add(triplet);
                    left++;
                    right--;
                    while(left< right && arr[left]== arr[left-1]){
                        left++;
                    }
                    while( left<right && arr[right]== arr[right-1]){
                        right--;
                    }

                }
            }

        }
        return answer;

    }

    public static void main(String[] args) {
        List<List<Integer>> result = ThreeSum.sum(arr);
        System.out.println(result);
    }
}
