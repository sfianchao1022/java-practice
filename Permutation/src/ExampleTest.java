import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ExampleTest {

    public static List<List<Integer>> output=new ArrayList<>();

    public static void main(String[] args){

//        permutation("abc",0,2);
        permute(new int[]{1,2,3});

    }

    public static void permutation(String str,int s,int e){
        ArrayList<Integer> list=new ArrayList<>();
        if(s==e){
//            System.out.println(str);
            for (int i=0;i<str.length();i++){
                list.add(Integer.valueOf(str.substring(i,i+1)));
            }
//            System.out.println(list);
            output.add(list);
        }else{
            for (int i=s;i<=e;i++){
                str=swap(str,s,i);
                permutation(str,s+1,e);
                str=swap(str,s,i);

            }
        }


    }

    public static String swap(String s,int a,int b){
        char temp;
        char[] charArray=s.toCharArray();
        temp=charArray[a];
        charArray[a]=charArray[b];
        charArray[b]=temp;

        return String.valueOf(charArray);
    }

    public static List<List<Integer>> permute(int[] nums) {
        String s="";
        for (int i=0;i<nums.length;i++){
            s+=String.valueOf(nums[i]);
        }
//        System.out.println(s);
        int n=s.length();
        permutation(s,0,n-1);
//        System.out.println(ans);
        System.out.println(output);
        return output;
    }



}
