public class ExampleTest {

    public static void main(String[] args){
        Double output=myPow(2.00000,-5);
        System.out.println(output);
    }

    public static double myPow(double x, int n) {
        if (n<0){

            if (n==0){
                return 1;
            }else{
                return (1/x)*myPow(x,++n);
            }

        }else{

            if (n==0){
                return 1;
            }else{
//            n=n-1;
                return x*myPow(x,--n);
            }

        }
    }
}
