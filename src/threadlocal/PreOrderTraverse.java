package threadlocal;

public class PreOrderTraverse {
	
	public void preOrder(TreeNode root) {
		if(root !=null) {
		System.out.println(root.value);
		preOrder(root.left);
		preOrder(root.right);
		}
	}
	
	public static void main(String []args) {
		PreOrderTraverse prt = new PreOrderTraverse();
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(6,c,d);
		TreeNode f = new TreeNode(5,null,b);
		TreeNode g = new TreeNode(7,f,a);
		TreeNode h = new TreeNode(8,e,null);
		TreeNode i = new TreeNode(9,g,h);
        prt.preOrder(i);

	}
}
