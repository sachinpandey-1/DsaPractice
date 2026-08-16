package arraymediam;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2,5,4, 9};

        better(arr.clone());
        optimal(arr);
    }

    public static void better(int[] arr) {
        int i = 0;
        int wanted = 12;
        int j = arr.length - 1;
        Arrays.sort(arr);
        boolean found = false;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == wanted) {
                System.out.println(" Yes");
                System.out.println("Index : " + i + " " + j);
            } else if (sum < wanted)
                i++;
            else j--;
                found = true;
                break;
        }
        if (!found) {
            System.out.println(" No ");
        }
    }

    public static void optimal(int[] arr) {
        int wanted = 12;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i= 0; i< arr.length; i++){
            int comp = wanted -arr[i];
            if (map.containsKey(comp)){
                System.out.println(" Yes ");
                System.out.println("Index : " + map.get(comp) + "  " + i);
                return;
            }
            map.put(arr[i],i);
        }
        System.out.println(" No");


    }
}

