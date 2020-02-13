
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static HashMap<String,String> phone=new HashMap<>();
    public static ArrayList<String> output=new ArrayList<>();
    public static String combination="";
    public static void main(String[] args) {
	// write your code here
        String s="";
        String str="abcdefg";
        phone.put("2","abc");
        phone.put("3","def");

        //String ans=recursive(s,"23");
        recursive(s,"23");
        //System.out.println(ans);
        System.out.println(output);

        System.out.println(str.substring(2));
    }

    //遞迴的return若放在for-loop內，recursive的中止條件，會影響for-loop進入下一個迴圈
    //沒有return的遞迴，用for-loop的條件終止recursive
    public static void recursive(String string,String num){
        String letter="";
        if(num.length()==0){
            output.add(string);
            //return "";
        }
        else{
            //System.out.println(combination);
            letter=phone.get(num.substring(0,1));
            //for-loop決定a or b or c當第一個
            for(int i=0;i<letter.length();i++){
                //letter=phone.get(num.substring(0,1));
                combination=letter.substring(i,i+1);
                System.out.println(combination);
                System.out.println(letter.substring(i,i+1));
                String ans=string+combination;
                //num.substring(1) => index 1 之後的String all print(等同每次往後一個)
                recursive(ans,num.substring(1));

                //return combination+recursive(string,num.substring(1));
            }

        }
        //throw new IllegalArgumentException("No two sum solution");
    }
}
