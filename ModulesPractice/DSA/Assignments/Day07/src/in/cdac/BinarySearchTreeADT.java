package in.cdac;


public class BinarySearchTreeADT implements BST{
	public class TNode{
		int data;
		TNode leftChild;
		TNode rightChild;
		public TNode() {}
		public TNode(int data) {
			this.data = data;
			this.leftChild = null;
			this.rightChild = null;
		}
	}
	TNode rootNode = new TNode();
	@Override
	public void setRoot(int data) {
		this.rootNode.data = data;
	}
	
	@Override
	public TNode insertData(TNode root, int data) {
		if(root == null) return new TNode(data);  
		if(root.data < data) 
			root.rightChild = insertData(root.rightChild, data);
		if(root.data > data)
		root.leftChild = insertData(root.leftChild, data);
		return root;
	}
	
	public TNode searchNode(int value) {
		if(rootNode == null) throw new RuntimeException("Root is Null.");
		return searchNode(rootNode, value);
	}
	
	private TNode searchNode(TNode root, int value) {
		if(root.data == value) return root;
		
		if(root.data > value) return searchNode(root.rightChild, value);
		return searchNode(root.rightChild, value);
	}


	public int findSmallest(TNode root) {
		if(root.leftChild == null) return root.data;
		int smallest = findSmallest(root.leftChild);
		return Math.max(smallest,findSmallest(root.leftChild));
	}
	
	public int findLargest(TNode root) {
		if(root.rightChild == null) return root.data;
		int largest =  findSmallest(root.rightChild);
		return Math.max(largest, findLargest(root.rightChild));
	}
	
	
	public void printUsingInorder(TNode root) {
		if(root != null) {
			printUsingInorder(root.leftChild);
			System.out.println(root.data);
			printUsingInorder(root.rightChild);
		}
	}



}
