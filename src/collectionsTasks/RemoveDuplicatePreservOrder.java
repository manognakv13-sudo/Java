package collectionsTasks;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatePreservOrder {
    public int[] removeDup(int[] arr){
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for(int i : arr){
            linkedHashSet.add(i);
        }
        int[] array = new int[linkedHashSet.size()];
        int j = 0;
        for(Integer i: linkedHashSet){
            array[j] = i;
            j++;
        }
        return array;


    }
    public static void main(String[] args) {
        int[] arr = {7,8,0,9,8,1,4,3,2,6,2,0,7};
        RemoveDuplicatePreservOrder rm = new RemoveDuplicatePreservOrder();
        int[] result = rm.removeDup(arr);
        for(int i: result){
            System.out.print(i+" ");
        }
    }
}
