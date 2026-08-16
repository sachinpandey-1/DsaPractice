package array;

public class MoveZeroToEnd {
    public static void main(String[] arg){
        int[] arr = { 1,3,0,5,0,9,0};
        int [] temp = new int  [arr.length];
        int k = 0;
        for(int i=0; i< arr.length;i++){
            if (arr[i]!=0){
                temp [k] = arr[i];
                k++;}
            }
            while (k<temp.length){
                temp [k] = 0; k++;
            }
            for(int i = 0; i<temp.length;i++){
                System.out.print(temp[i] + " ");

            }
        }
    }

