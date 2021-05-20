package leetCode;

import java.util.ArrayList;

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
}
