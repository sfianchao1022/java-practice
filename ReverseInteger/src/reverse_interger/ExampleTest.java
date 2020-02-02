package reverse_interger;

public class ExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverse(123);
		reverse(120);
		reverse(-120);
		reverse(-123);
		reverse(102);
		reverse(-102);
		reverse(5278);
		
		reverse(1534236469);
		
		System.out.println(pow(2,5));
	}
	
	public static int pow(int a,int b) {
		int sum=1;
		for(int i=0;i<b;i++) {
			sum=sum*a;
		}
		return sum;
	}
	
	public static void reverse(int x) {
		
		System.out.println("array : "+x);
		
		int temp=x;
		int arrNum=0;
		int sum=0;
		
		if(temp>0) {
			
			while(temp>0) {
				arrNum++;
				temp=temp/10;
			}
			
		}else {
			
			temp=temp*-1;
			
			while(temp>0) {
				arrNum++;
				temp=temp/10;
			}
			
		}

		
		System.out.println("array numbers : "+arrNum);
		
		int[] arr=new int[arrNum];
		
		for(int i=0;i<arrNum;i++) {
			arr[i]=x%10;
			x=x/10;
			System.out.println(arr[i]);
			sum=sum+arr[i]*pow(10,arrNum-1-i);
			System.out.println(arr[i]*pow(10,arrNum-1-i));
			
		}
		System.out.print("reverse array : "+sum);
		System.out.println(" ");
		
		System.out.println(9*pow(10,9));//overflow
		System.out.println(pow(10,9));
		System.out.println(pow(2,31)-1);
		
	}

}
