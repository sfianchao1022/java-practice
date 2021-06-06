package leetCode;

public class Main {

    public static TreeNode root;

    public static void main(String[] args) {
	// write your code here

        int[] nums = {3, 5, 4, 2, 1};
        tree(nums);


    }

    public static void tree(int[] nums){

//        addNode(3);
//        addNode(5);
//        addNode(4);
//        addNode(2);

        for (int num : nums){
            if (root == null){
                System.out.println("root is null");
            }
            addNode(num);
        }

        System.out.println(root.val);
        System.out.println(root.right.val);
        System.out.println(root.left.val);
        System.out.println(root.right.left.val);
        System.out.println(root.left.left.val);
    }

    // 以最初的節點root所長出來的tree再往下增加節點
    public static void addNode(int val){
        root = buildBinaryTree(val, root);
    }

    public static TreeNode buildBinaryTree(int val, TreeNode current){

        if (current == null){
            return new TreeNode(val);
        }else if (val < current.val){
            current.left = buildBinaryTree(val, current.left);
        }else {
            current.right = buildBinaryTree(val, current.right);
        }

        return current;
    }

}
