package array;

import java.util.*;

public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 3, 4, 6, 7, 9};
        int arr2[] = {1, 2, 4, 4, 5, 7, 7, 8};
        int i = 0;
        int j = 0;
        List<Integer> common = new ArrayList<>();
        while (i < arr1.length && j < arr2.length)
        {

            // duplicate element

            while (i > 0 && i < arr1.length && arr1[i] == arr1[i - 1])
            {
                i++;
            }
            while (j > 0 && j < arr2.length && arr2[j] == arr2[j - 1])
            {
                j++;}

                // one array exit
                if (i >= arr1.length || j >= arr2.length) {
                    break;

            }
            // compare
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                common.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println(common);

    }
}
