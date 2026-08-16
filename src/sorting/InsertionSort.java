package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = { 2,1,4,3,7,5,6,9,8};
        for (int i = 0; i< arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] >current){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }
}
