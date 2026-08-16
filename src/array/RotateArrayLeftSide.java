package array;

public class RotateArrayLeftSide {
    public static void main(String arg[]){
        int arr[] = {2, 12, 23, 33, 78};
        int temp = arr[0];
        int i = 1;
        for (i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];}
        arr[arr.length - 1] = temp;

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);}
    }
}
