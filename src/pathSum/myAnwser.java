package pathSum;

import java.io.IOException;
/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals the given sum.
 * 
 * For example: Given the below binary tree and sum = 22,
 *  	  5
         / \
        4   8
       /   / \
      11  13  4
     /  \      \
    7    2      1
 * 
 * which sum is 22.
 */
public class myAnwser {
	public static void main(String[] args) throws IOException {
		TreeNode root = createTree();
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

	private static TreeNode createTree() {
		TreeNode root = new TreeNode(5), left1 = new TreeNode(4), rigth1 = new TreeNode(8), left21 = new TreeNode(11),
				left22 = new TreeNode(13), rigth22 = new TreeNode(4), left31 = new TreeNode(7),
				rigth31 = new TreeNode(2), right33 = new TreeNode(1);
		root.left = left1;
		root.right = rigth1;
		left1.left = left21;
		left1.right = null;
		rigth1.left = left22;
		rigth1.right = rigth22;
		left21.left = left31;
		left21.right = rigth31;
		left22.left = null;
		left22.right = null;
		rigth22.left = null;
		rigth22.right = right33;
		left31.left = null;
		left31.right = null;
		rigth31.left = null;
		rigth31.right = null;
		right33.left = null;
		right33.right = null;
		return root;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}