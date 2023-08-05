package Trees;

import java.util.*;

public class LeveLOrderBinaryTree {
    TreeNode root;
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> finalAns = new ArrayList<List<Integer>>();
        if (root == null) {
            return finalAns;
        }
        q.add(root);
        while (!q.isEmpty()) {
            int levels = q.size();
            System.out.println(q);
            System.out.println(levels);
            List<Integer> subLevels = new ArrayList<>();
            for (int i = 0; i < levels; i++) {
                if (q.peek().left != null) {
                    q.add(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.add(q.peek().right);
                }
                subLevels.add(q.remove().val);
                System.out.println(subLevels);
            }
            finalAns.add(subLevels);
        }

        return finalAns;

    }

    void printLevelOrderBT() { levelOrder(root); }
    public static void main(String[] args)
    {
        LeveLOrderBinaryTree tree = new LeveLOrderBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        // Function call
        System.out.println(
                "\nInorder traversal of binary tree is ");
        tree.printLevelOrderBT();
    }
}
