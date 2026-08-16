package array;

public class SecondLargestElement {
    public static void main(String[]arg){
        int arr[] = {8, 15, 23, 34, 44, 88};
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

        }
        System.out.println("Largest Number = " + largest);
        System.out.println("secondLargest = " + secondLargest);
    }
}


