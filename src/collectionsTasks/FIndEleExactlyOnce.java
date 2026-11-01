package collectionsTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FIndEleExactlyOnce {

    public int[] Element(ArrayList<Integer> arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int count = 0;
        for(int i: map.values()){
            if(i == 1){
                count++;
            }
        }
        int[] number = new int[count];
        int j = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                number[j] =entry.getKey();
                j++;
            }
        }

        return number;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,2,3,4,4,5));
        FIndEleExactlyOnce f = new FIndEleExactlyOnce();
        int[] num =  f.Element(list);
        for(int i : num){
            System.out.print(i+" ");
        }

    }
}
