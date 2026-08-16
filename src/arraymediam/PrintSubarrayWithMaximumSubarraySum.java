package arraymediam;

public class PrintSubarrayWithMaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, -2, -3, 4, 2, 3, -1, 5, -8, -3};
        int currentsum = 0;
        int maxsum = arr[0];
        int start = 0 ;
        int end = 0;
        int tempstart = 0;
        for (int i = 0; i < arr.length; i++) {
            currentsum = currentsum + arr[i];
            if (currentsum > maxsum) {
                maxsum = currentsum;
                start = tempstart;
                end = i;
            }
            if (currentsum < 0) {
                currentsum = 0;
                tempstart = i+1;
            }

        }
        System.out.println("Maximum sum of SubArray : " + maxsum);
        for (int i = start ; i<= end ; i++){
            System.out.print(arr[i]);
        }
    }
}

