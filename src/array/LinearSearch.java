package array;

public class LinearSearch {
    public static void main(String[] arg) {
        int[] arr = {2, 3, 1, 6, 8, 9};
        int num = 14;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(i);
                found = true;
                break;
            }

        }
        if (found == false) {
            System.out.println(-1);
        }

    }

}


