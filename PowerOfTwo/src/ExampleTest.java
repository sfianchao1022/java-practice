public class ExampleTest {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(55));
        System.out.println(isPowerOfTwo(9));
    }

    public static boolean isPowerOfTwo(int n) {
        int i=1;
        while (i<=n){
            System.out.println(i);
            if (n==i){
                return true;
            }
            i=i*2;
        }

        System.out.println(n+" is between "+i/2+"~"+i);

        return false;
    }
}
