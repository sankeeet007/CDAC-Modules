package in.cdac;

import in.cdac.BinarySearchTreeADT.TNode;

public interface BST {
	public void setRoot(int data);
	public BinarySearchTreeADT.TNode insertData(BinarySearchTreeADT.TNode root, int data);
	public boolean searchNode(int value);
	public int findSmallest(TNode root);
	public int findLargest(TNode root);
}
