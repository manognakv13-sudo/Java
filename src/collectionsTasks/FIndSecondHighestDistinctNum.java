package collectionsTasks;

import java.util.HashSet;
import java.util.Set;

public class FIndSecondHighestDistinctNum {
    public int secondHigh(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i< arr.length; i++){
            set.add(arr[i]);
        }
        int firstMax = 0;
        int SecondMax = 0;
        for(int i: set){

            if(i > firstMax){
                SecondMax = firstMax;
                firstMax = i;
            }
        }

        return SecondMax;
    }
    public static void main(String[] args) {
        int[] arr ={9,9,0,0,0,0,0,8,10,7,4,3,3,4,2,3};
        FIndSecondHighestDistinctNum f = new FIndSecondHighestDistinctNum();
        System.out.println(f.secondHigh(arr));
    }
}
