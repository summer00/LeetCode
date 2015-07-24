package common;
/**
 *  	  5
         / \
        4   8
       /   / \
      11  13  4
     /  \      \
    7    2      1
 *
 */
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	TreeNode(int x) {
		val = x;
	}

	public static TreeNode createTree() {
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
