package in.cdac;

import java.util.Stack;

public class BinaryTreeADT implements Tree{
	public static String str = "";
	public class TNode{
		int data;
		TNode leftNode;
		TNode rightNode;
		// parameterized cnstr
		public TNode(int data) {
			this.data = data;
			leftNode = null;
			rightNode = null;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public TNode getLeftNode() {
			return leftNode;
		}
		public void setLeftNode(TNode leftNode) {
			this.leftNode = leftNode;
		}
		public TNode getRightNode() {
			return rightNode;
		}
		public void setRightNode(TNode rightNode) {
			this.rightNode = rightNode;
		}
		
	}
	
	public TNode rootNode = new TNode(5);
	
	@Override
	public void setRoot(int data) {
		rootNode.setData(data);
	}
	
	@Override
	public void addLeft(int data) {
		TNode tmpNode = rootNode;
		while(tmpNode.leftNode != null) tmpNode = tmpNode.leftNode;
		
		tmpNode.leftNode = new TNode(data);
	}

	@Override
	public void addRight(int data) {
		TNode tmpNode = rootNode;
		while(tmpNode.rightNode != null) tmpNode = tmpNode.rightNode;
	
		tmpNode.rightNode = new TNode(data);
		
	}
	
	@Override
	public void printUsingPreorder(TNode root) {
		if(root != null) {
			//System.out.println(root.data);
			str += root.data + " ";
			printUsingPreorder(root.leftNode);
			printUsingPreorder(root.rightNode);
		}
	}

	@Override
	public void printUsingInorder(TNode root) {
		if(root != null) {
			printUsingInorder(root.leftNode);
//			System.out.println(root.data);
			str += root.data + " ";
			printUsingInorder(root.rightNode);
		}
	}

	@Override
	public void printUsingPostorder(TNode root) {
		if(root != null) {
			printUsingPostorder(root.leftNode);
			printUsingPostorder(root.rightNode);
//			System.out.println(root.data);
			str += root.data + " ";
		}
	}
	
	// Wrapper Method
	public int countLeafNodes() {
		return countLeafNodes(rootNode);
	}
	// its implementation
	private int countLeafNodes(TNode root) {
		if(root == null) return 0;
		if(root.leftNode == null && root.rightNode == null) return 1;
		return countLeafNodes(root.leftNode) + countLeafNodes(root.rightNode);
	}
	
	public int countNodes() {
		return countNodes(rootNode);
	}
	
	private int countNodes(TNode root) {
		if(root == null) return 0;
		return 1 + countNodes(root.leftNode) + countNodes(root.rightNode);
	}
	
	public int CountNodesWithValue(int data) {
		return CountNodesWithValue(rootNode, data);
	}
	
	private int CountNodesWithValue(TNode root, int data) {
		if(root == null) return 0;
		int match = (root.data == data) ? 1 : 0;
		return match + CountNodesWithValue(root.leftNode, data) + CountNodesWithValue(root.rightNode, data);
	}

	public int getHightOfTree() {
		return getHightOfTree(rootNode);
	}
	
	private int getHightOfTree(TNode rootNode) {
		if(rootNode == null)	return -1;
		int leftHeight = getHightOfTree(rootNode.leftNode);
		int rightHeight = getHightOfTree(rootNode.rightNode);	
		return (leftHeight > rightHeight) ? leftHeight + 1: rightHeight + 1;
	}

	@Override
	public void IterativeInorder(TNode root) {
		TNode currNode = root;
		Stack<TNode> travStack = new Stack<>();
		while(currNode != null || !travStack.isEmpty()) {
			while(currNode != null) {
				travStack.push(currNode);
				currNode = currNode.leftNode;
			}
			currNode = travStack.pop();
//			System.out.println(currNode.data + " ");
			str += currNode.data + " ";
			currNode = currNode.rightNode;
		}
		
	}
}
