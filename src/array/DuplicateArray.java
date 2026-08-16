package array;

public class DuplicateArray {
    public static void main(String[]arg){
        int arr[] = {1,2,2,3,3,3,4,4,5};
        int i = 0;
        for(int j= 1; j < arr.length; j++ ){
            if(arr[i]!= arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println("different element are: ");
        for( int c=0; c<=i;c++){
            System.out.println(arr[c] + " ");
        }
        System.out.print("total different element: " + (i+1));
    }
}
