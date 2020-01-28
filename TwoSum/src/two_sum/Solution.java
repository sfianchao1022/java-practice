package two_sum;

class Solution {

	//沒有new的array為reference variable
    public int[] num;
    public int target;
    public int a;
    public int b;
    
    public Solution(){
          
    }
    
    public Solution(int[] num,int target){	
    	this.num=num;
    	this.target=target;
    }
    
    public int[] twoSum() {
    	for(int i=0;i<num.length;i++) {
    		for(int j=i+1;j<num.length;j++) {
    			if(target==num[i]+num[j]) {
    				//System.out.println(num[i]+" "+num[j]);
    				//a=num[i];
    				//b=num[j];
    				
    				return new int[]{num[i],num[j]};
    			}
    		}
    	}
    	//例外處理
    	throw new IllegalArgumentException("No two sum solution");
    	
    	//若不使用例外處理，用a,b去接收 因為"return" is for method
    	//Use a finally block(例外處理) or save the return value in a variable that you return at the end of your code
    	//return new int[]{a,b};
    }
   
}