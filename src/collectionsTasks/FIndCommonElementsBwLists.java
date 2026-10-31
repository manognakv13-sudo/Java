package collectionsTasks;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FIndCommonElementsBwLists {

    public int[] findCommon(List<Integer> list1, List<Integer> list2){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i< list1.size(); i++){
            if(list2.contains(list1.get(i))){
                set.add(list1.get(i));
            }

        }
        int[] arr = new int[set.size()];
        int j = 0;
        for(int i : set){
            arr[j] = i;
            j++;
        }
        return arr;

    }


    public static void main(String[] args) {
        List<Integer> List1 = List.of(4,5,6,3,2,4,5);
        List<Integer> List2 = List.of(8,9,9,2,4,1,5);
        FIndCommonElementsBwLists f = new FIndCommonElementsBwLists();
        int[] result = f.findCommon(List1 , List2);
        for(int i : result) {
            System.out.print(i+" ");
        }
    }
}
