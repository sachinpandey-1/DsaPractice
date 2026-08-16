package arrayhard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    static int[] arr = {-1, 0, -1, 0, -2, 2};

    public static List<List<Integer>> sum(int[] ) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < arr.length - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = arr.length - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum < 0) {
                        left++;
                    } else if (sum > 0) {
                        right--;
                    } else {
                        List<Integer> foursum = new ArrayList<>();
                        foursum.add(arr[i]);
                        foursum.add(arr[j]);
                        foursum.add(arr[left]);
                        foursum.add(arr[right]);
                        answer.add(foursum);
                        left++;
                        right--;
                    }
                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right+1]){
                        right--;
                    }
                }
            }
        }
        return answer;
    }

//    public static void main(String[]args
//        List<List<Integer>> result = FourSum.sum(arr);
//    }
}
