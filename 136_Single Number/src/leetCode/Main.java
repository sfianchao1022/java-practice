package leetCode;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] testCase = {3, 2, 4, 5, 3, 1, 4, 2, 1};

        Solution solution = new Solution();
        System.out.println(solution.singleNumber(testCase));
        System.out.println(solution.hashTable(testCase));
    }
}
