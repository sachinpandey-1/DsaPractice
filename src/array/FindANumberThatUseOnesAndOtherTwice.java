package array;

public class FindANumberThatUseOnesAndOtherTwice {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 5, 4, 5};

        bruteforce(arr);
        optimal(arr);
    }

    public static void optimal(int[] arr) {

        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];

        }
        System.out.println(xor);
    }


    public static void bruteforce(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]== arr[j]){
                    count++;
                }

            }
            if(count ==1){
                System.out.println(arr[i]);
                return;
            }

        }
    }
}
