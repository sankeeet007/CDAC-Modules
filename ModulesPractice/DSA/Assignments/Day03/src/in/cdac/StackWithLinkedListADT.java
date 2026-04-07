package in.cdac;

public class StackWithLinkedListADT implements Stack {

	SinglyLinkedListADT stackObjAdt = new SinglyLinkedListADT();
	
	@Override
	public void displayStack() {
		stackObjAdt.displayList();
	}

	@Override
	public boolean isEmpty() {
		return stackObjAdt.isEmpty();

	}

	@Override
	public int peek() {
		return stackObjAdt.getHead();
		
	}

	@Override
	public int pop(){
		int data = stackObjAdt.deleteFirst();
		return data;
	}

	@Override
	public void push(int data){
		stackObjAdt.addFirst(data);
	}

}
