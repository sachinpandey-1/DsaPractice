package arraymediam;

import java.util.*;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        extraspace(arr);
        nospace(arr);
    }

    public static void extraspace(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int max = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                leaders.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(leaders);
        System.out.println(leaders);
    }

    public static void nospace(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1];
        int leadercount = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                arr[n-1-leadercount] = arr[i];
                leadercount++;
            }
        }
        for (int i = 0, j = leadercount - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = n- leadercount;i<n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}




