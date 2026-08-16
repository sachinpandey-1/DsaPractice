package array;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = {2, 4, 5, 6, 7, 8, 8};
        int arr2[] = {1, 2, 2, 3, 3, 4, 5, 6, 7, 9};
        int i = 0;
        int j = 0;
        List<Integer> union = new ArrayList();
        while (i < arr1.length || j < arr2.length) {

            // skip duplicates

            while (i > 0 && i < arr1.length && arr1[i] == arr1[i - 1]) {
                i++;
            }
            while (j > 0 && j < arr2.length && arr2[j] == arr2[j - 1]) {
                j++;
            }

            // if any array exit

            if (i >= arr1.length) {
                union.add(arr2[j]);
                j++;
                continue;
            }
            if (j >= arr2.length) {
                union.add(arr1[i]);
                i++;
                continue;
            }
            // compare

            if (arr1[i] < arr2[j]) {
                union.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                union.add(arr2[j]);
                j++;
            } else {
                union.add(arr1[i]);
                j++;
                i++;
            }

        }
        System.out.println(union);
    }
}


