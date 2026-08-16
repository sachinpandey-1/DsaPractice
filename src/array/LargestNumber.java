package array;

public class LargestNumber {
     public static void main(String arg[]) {
         int arr[] = {8, 15, 23, 34,98, 44, 88};
         optimal(arr);
        bruteforce(arr);
        }

        //  this is a optimal approach

    public static void optimal(int [] arr){
        int largest = arr[0];
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] > largest) {
                 largest = arr[i];
             }
         }
         System.out.println("Largest Element = " + largest);
     }
     // this is a brute force approach

    public static void bruteforce(int [] arr){
         for (int i= 0;i<arr.length;i++){
             boolean islargest= true;
             for (int j=1;j<arr.length;j++){
                 if (arr[j]>arr[i]){
                      islargest = false;
                     break;
                 }
             }
             if(islargest){
                 System.out.println(arr[i]);
             }

         }

    }













}
