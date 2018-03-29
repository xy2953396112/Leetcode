package Leetcode.code_094_Binary_Tree_Inorder_Traversal;
import java.util.LinkedList;
import java.util.List;
public class Solution2 {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;

        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.addLast(node);
                node = node.left;
            }

            if (!stack.isEmpty()) {
                node = stack.removeLast();
                result.add(node.val);
                node = node.right;
            }
        }

        System.out.println(result);
        return result;
    }
}
