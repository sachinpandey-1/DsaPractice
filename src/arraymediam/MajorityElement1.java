package arraymediam;

import java.util.HashMap;

public class MajorityElement1 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 1, 2, 2};
        hashmap(arr);
        optimal(arr);
    }
    public static void optimal( int [] arr){
        int freq = 0;
        int ans =0;
        for ( int i =0; i< arr.length; i++){
            if(ans == 0){
                ans = arr[i];
                freq =1;
            }
            else if ( arr[i]== ans){
                freq++;
            }
            else{
                freq--;
            }
        }
        System.out.println("Frequency = "+ freq);
        System.out.println("Answer = " + ans);
    }

    public static void hashmap( int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i< arr.length-1;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i] + 1));
            }
            else {
                map.put(arr[i],1 );
            }
        }
        System.out.println(map);
    }











}






