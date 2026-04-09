package in.cdac;

public class DoublyCircularLinkedListADT implements CircularList {

    private class DLLNode {
        int data;
        DLLNode next;
        DLLNode previous;

        public DLLNode(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    private DLLNode head;

    public DoublyCircularLinkedListADT() {
        head = new DLLNode(-1); 
        head.next = head;
        head.previous = head;
    }

    @Override
    public void addFirst(int element) {
        DLLNode newNode = new DLLNode(element);
        
        newNode.next = head.next;
        newNode.previous = head;
        
        head.next.previous = newNode;
        head.next = newNode;
    }

    @Override
    public void addLast(int element) {
        DLLNode newNode = new DLLNode(element);
        
        newNode.next = head;
        newNode.previous = head.previous;
        
        head.previous.next = newNode;
        head.previous = newNode;
    }

    @Override
    public int deleteFirst() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        DLLNode firstNode = head.next;
        int data = firstNode.data;
        
        head.next = firstNode.next;
        firstNode.next.previous = head;
        
        return data;
    }

    @Override
    public int deleteLast() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        DLLNode lastNode = head.previous;
        int data = lastNode.data;
        
        head.previous = lastNode.previous;
        lastNode.previous.next = head;
        
        return data;
    }

    public boolean isEmpty() {
        return head.next == head;
    }

    public void printForward() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        DLLNode current = head.next;
        while (current != head) {
            System.out.print(current.data + " <=> ");
            current = current.next;
        }
        System.out.println("(Head)");
    }

    public void printBackward() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        DLLNode current = head.previous;
        while (current != head) {
            System.out.print(current.data + " <=> ");
            current = current.previous;
        }
        System.out.println("(Head)");
    }

    public void addAtPosition(int position, int element) {
        DLLNode newNode = new DLLNode(element);
        DLLNode current = head.next;
        int i = 0;

        while (current != head && i < position) {
            current = current.next;
            i++;
        }

        newNode.next = current;
        newNode.previous = current.previous;
        current.previous.next = newNode;
        current.previous = newNode;
    }

    public void delete(int element) {
        DLLNode current = head.next;
        while (current != head) {
            if (current.data == element) {
                current.previous.next = current.next;
                current.next.previous = current.previous;
                return;
            }
            current = current.next;
        }
        System.out.println("Element " + element + " not found.");
    }
}