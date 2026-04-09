package in.cdac;

public interface CircularList {
	public void addFirst(int data);
	public void addLast(int data);
	public int deleteFirst();
	public int deleteLast();
	public void deleteAll(int value);
	public int search();
	public void displayList();
}
