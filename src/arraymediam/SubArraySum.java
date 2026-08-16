package arraymediam;

public class SubArraySum {
    public static void main(String[] args) {
        int [] arr = { 1,-2,-3,4,2,3,-1,5,-8,-3};
        int currentsum = 0;
        int maxsum = arr[0];
        for (int i= 0; i< arr.length;i++){
            currentsum = currentsum + arr[i];
            if (currentsum > maxsum){
                maxsum = currentsum;
            }
            if ( currentsum < 0){
                currentsum = 0;
            }

        }
        System.out.println("Maximum sum of SubArray : " + maxsum);
    }
}
