package lowestCommonAncestor;

import common.TreeNode;
/**
 * Î´Íê³É
 */
public class myAnswer {
	public static void main(String[] args) {
		TreeNode root = TreeNode.createTree();
		System.out.println(lowestCommonAncestor(root, root.right.left, root.right.right.right));
	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root.right == p && root.left == q){
			return root;
		}else if(root.right == p){
			return lowestCommonAncestor(root.left, p, q);
		}
		return null;
	}
	
}
