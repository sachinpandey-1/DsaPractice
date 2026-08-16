package array;

public class CheckingArraySortedOrNot {
    public static void main(String[] arg){
        int arr[] = {8, 15, 23, 34, 44, 88};
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] >= arr[i - 1]) {
            }
            else {
                System.out.println("Array is not sorted");
                return;
            }

        }
        System.out.println("Array is sorted");
    }
}
