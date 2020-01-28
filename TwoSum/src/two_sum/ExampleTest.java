package two_sum;

public class ExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//java的array視為物件 要new
		int[] num=new int[]{5,9,37,76};
		int target1=46;
		int target2=113;
		
		Solution S1 = new Solution(num,target1);
        Solution S2 = new Solution(num,target2);
        int[] result1=S1.twoSum();
        int[] result2=S2.twoSum();
        
        //return type is int[] 接收的是address 所以要有一個物件去接收 再印出答案 
        //System.out.println(S1.twoSum());
        System.out.println(result1[0]+" "+result1[1]);
        System.out.println(result2[0]+" "+result2[1]);
        
        for(int i=0;i<result1.length;i++) {
        	System.out.println(result1[i]);
        }
        
	}

}
