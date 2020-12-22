package workerthread;

public class TreeDepth {
	public static void main(String []args) {
		
		TreeNode root = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn4 = new TreeNode(4);
		TreeNode tn5 = new TreeNode(5);
		TreeNode tn6 = new TreeNode(6);
		TreeNode tn7 = new TreeNode(7);		
		root.left = tn2;
		root.right = tn3;
		tn2.left = tn4;
		tn2.right = tn5;
		tn3.right = tn6;
		tn5.left = tn7;
		System.out.println(treeDepth(root));
	}
	
	static int treeDepth(TreeNode root) {
		if(root !=null) {
			int left = treeDepth(root.left);
			int right = treeDepth(root.right);
			return left > right?left + 1:right+1;
		}
		return 0;
	}
}
