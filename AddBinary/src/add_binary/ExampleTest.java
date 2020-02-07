package add_binary;

public class ExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result=addBinary("1010110101"
				,"1100001");
		System.out.println(result);
		
	}
	
	public static String addBinary(String a,String b) {
		
		String ans="";
		int carry=0;
		int[] arrA=new int[a.length()+1];
		int[] arrB=new int[b.length()+1];
		int[] arrSum=new int[Math.max(a.length()+1,b.length()+1)];
		int count=0;
		
		try {
			//valueOf(String) returns a new Integer() object whereas parseInt(String) returns a primitive int
			//int t1 = Integer.parseInt(Integer.valueOf("123"));//error
			//int t2 = Integer.valueOf(Integer.parseInt("123"));
		
			int x=Integer.valueOf(a);
			int y=Integer.parseInt(b);			
			
			while(x>=0) {
				
				if(count>a.length()-1) {
					count=0;
					break;
				}
				
				arrSum[count]=arrA[count]=x%2;
				System.out.println(arrA[count]+" ");
				x=x/10;
				count++;
				
			}
			
			while(y>=0) {
				
				if(count>b.length()-1) {
					break;
				}
				
				arrSum[count]+=arrB[count]=y%2;
				System.out.println(Integer.toString(arrB[count]));
				
				y=y/10;
				count++;
				
			}
			
			//System.out.println(Integer.toString(arrSum[2])+" "+Integer.toString(arrSum[1])+" "+Integer.toString(arrSum[0]));
			
			for(int i=0;i<arrSum.length;i++) {

				if(arrSum[i]+carry>1) {
					
					arrSum[i]=(arrSum[i]+carry)%2;
					System.out.println(" "+arrSum[i]);
					System.out.println("c : "+carry);
					//ans+=Integer.toString(arrSum[i]);
					carry=1;
					
				}else {
					
					arrSum[i]=(arrSum[i]+carry)%2;
					//ans+=Integer.toString(arrSum[i]);
					System.out.println("c : "+carry);
					carry=0;
					System.out.println("  "+arrSum[i]);
					
				}

			}
			
			for(int i=0;i<arrSum.length;i++) {
				ans+=Integer.toString(arrSum[arrSum.length-1-i]);
				//System.out.println(Integer.toString(arrSum[arrSum.length-1-i]));
				//System.out.println(ans);
			}
		
 			System.out.println(ans.charAt(0));
			if(ans.charAt(0)=='0') {
				ans=Integer.toString(Integer.parseInt(ans));
			}
			
			System.out.println(ans);
		
		}catch(NumberFormatException e){
			
			System.out.println("error");
		}
		
		return ans;
		
	}

}
