package pathSum;

import java.io.IOException;
import common.TreeNode;

/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals the given sum.
 * 
 * For example: Given the below binary(common.TreeNode) tree and sum = 22
 * 
 * which sum is 22.
 */
public class myAnwser {
	public static void main(String[] args) throws IOException {
		TreeNode root = TreeNode.createTree();
		System.out.println(hasPathSum(root, 22));
	}

	// 改进：320ms
	public static boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		} else if (root.left == null && root.right == null) {
			return sum == root.val;
		} else {
			return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
		}
	}

	// 原方法：400ms
	public static boolean hasPathSum1(TreeNode root, int sum) {
		if (root == null) {
			return false;
		} else if (root.left == null && root.right == null) {
			if (root.val == sum) {
				return true;
			} else {
				return false;
			}
		} else {
			return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
		}
	}

}