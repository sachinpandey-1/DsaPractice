package array;

public class MissingNumber {
    public static void main(String[] args) {
        int arr1 [] = {1,3,4,2};
        int N = 4;
        boolean isAnythingMissing = false;
        for(int i=1;i<=N;i++){
            int csk = 0;
            for (int j= 0; j< arr1.length;j++){
                if (arr1[j]== i){
                    csk = 1;
                    break;
                }
            }
            if(csk== 0){
                isAnythingMissing = true;
                System.out.print("Missing Number is "+ i);
            }
        }

        if (!isAnythingMissing){
            System.out.println(-1);
        }



    }
    public void xorMethod(int[]arr){
        int arr1 [] = {1,3,4,2};
        int N = 4;
        int xor1 = 0;
        int xor2 = 0;
        int n = N-1 ;
        for (int i=0; i<n ; i++){
            xor2= xor2^arr1[i];
            xor1= xor1^ (i+1);
        }
        xor1 = xor1^N;
        if ((xor1^xor2) == 0){
            System.out.println(-1);
        }else {
            System.out.println(xor1 ^ xor2);
        }
    }


}
