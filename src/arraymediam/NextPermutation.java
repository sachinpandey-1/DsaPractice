package arraymediam;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {2, 1, 9, 7, 6, 4,};
        int pivot = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }
        if (pivot != -1) {
        for (int j = arr.length - 1; j > pivot; j--) {
            if (arr[j] > arr[pivot]) {
                int temp = arr[j];
                arr[j] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }
            int left = pivot + 1;
            int right = arr.length - 1;
            while (left < right) {
                int tempo = arr[left];
                arr[left] = arr[right];
                arr[right] = tempo;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

