import java.util.*;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> order = new ArrayList<>();
    	if(root == null) {
    		return order;
    	}
    	
    	order.add(Arrays.asList(root.val));
    	traverse(order, root, 1);
    	order.remove(order.size()-1);
        
    	return order;
    }
	
	private void traverse(List<List<Integer>> order, TreeNode node, int level){
		if(node == null)  {
			return;
		} else {
			if(order.size() == level) {
				order.add(new ArrayList<Integer>());
			}
			if(node.left != null) {
				order.get(level).add(node.left.val);
				traverse(order, node.left, level+1);
			}
			if(node.right != null) {
				order.get(level).add(node.right.val);
				traverse(order, node.right, level+1);
			}
		}
		
		
	}

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
