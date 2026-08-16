package array;

public class RotateArrayKplaces {
    public static void main(String[]arg){
        int arr[]= {1,3,4,8,9,};
        int d =2;
        d= d%arr.length;
       /*
        //step 1 : Make Temporary
        int [] temp = new int[d];

        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }

        //Step 2
        for(int i = d;i< arr.length;i++){
            arr[i-d]= arr[i];
        }

        //Step 3
        for(int i=0;i< temp.length;i++){
            arr[d+i+1] = temp[i];
        }
        */
        int[] temp = new int [d];
        for( int i=0;i<d;i++){
            temp[i]= arr[i];

        }







    }
}
