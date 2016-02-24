package leetcode;

public class HasPathSum {
	public class TreeNode {
		int val; 
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	public boolean hasPathSum(TreeNode root, int sum){
		if(root!=null){
			sum -= root.val;
			if(sum==0 && root.left == null && root.right == null){
				return true;
			}
			else
				return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
		}
		else
		return false;
	}
}
