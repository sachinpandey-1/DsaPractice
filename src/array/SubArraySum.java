package array;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 1, 1, 2, 1, 2};
        bruteforce(arr);
        optimal(arr);
    }

    public static void bruteforce(int[] arr) {
        int k = 9;
        int maxlen = 0;
        int i = 0;
        int n = arr.length;
        int count = 0;
        for (i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    count++;
                }

                if (sum == k) {
                    int len = j - i + 1;
                    if (len > maxlen) {
                        maxlen = len;
                    }
                }
            }
        }
        System.out.println("Total Subarrays: " + count);
        System.out.println("subarrays length = " + maxlen);
    }

    public static void optimal(int[] arr) {
        int k = 9;
        int i = 0;
        int sum = 0;
        int maxlen = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
            while (sum > k) {
                sum = sum - arr[i];
                i++;
            }
            if (sum == k) {
                int len = j - i + 1;
                if (len > maxlen) {
                    maxlen = len;
                }
            }

        }
        System.out.println("In optimal approach = " + maxlen);
    }
}

