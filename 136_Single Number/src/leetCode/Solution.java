package leetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public int singleNumber(int[] nums) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int num : nums){
            if(!arrayList.contains(num)){
                arrayList.add(num);
            }else{
                arrayList.remove(Integer.valueOf(num));
            }
        }

        return arrayList.get(0);

    }

    public int hashTable(int[] nums){

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums){
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        System.out.println(hashMap);

        for (int num : nums){
            if (hashMap.get(num) == 1){
                return num;
            }
        }

        return 0;
    }

}
