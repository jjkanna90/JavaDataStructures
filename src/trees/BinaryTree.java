package trees;

public class BinaryTree {
	
	BinaryTreeNode root;
	
	//create binary tree from array
	public BinaryTree(int[] arr){
		root = createBT(arr,0,arr.length-1);
	}
	
	private BinaryTreeNode createBT(int[] arr, int first, int last){
		
		
		int middle = (first+last)/2;
		if(last<first){
			return null;
		}
		BinaryTreeNode node = new BinaryTreeNode(arr[middle]);
		node.left = createBT(arr,first,middle-1);
		node.right = createBT(arr,middle+1,last);
		return node;
		
	}

}
