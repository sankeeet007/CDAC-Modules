package in.cdac;

public interface Tree {
	public void setRoot(int data);
	public void addLeft(int data);
	public void addRight(int data);
	public void printUsingPreorder(BinaryTreeADT.TNode root);
	public void printUsingInorder(BinaryTreeADT.TNode root);
	public void IterativeInorder(BinaryTreeADT.TNode root);
	public void printUsingPostorder(BinaryTreeADT.TNode root);
}
