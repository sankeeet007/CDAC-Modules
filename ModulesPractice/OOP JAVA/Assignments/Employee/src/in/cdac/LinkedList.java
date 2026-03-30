package in.cdac;

public class LinkedList<T> {

    Node<T> start;
    Node<T> end;
    Node<T> current;
    int maxCount;

    // ADD NODE
    public void add(T data) {
        Node<T> tmpNode = new Node<>(data);
        if (start == null) {
            start = end = current = tmpNode;
        } else {
            end.next = tmpNode;
            tmpNode.previous = end;
            end = tmpNode;
        }
        maxCount++;
    }

    // DELETE NODE
    public void delete(int index){
        if (start == null || index < 0 || index >= maxCount) {
            return;
        }

        if (start == end) {
            start = end = current = null;
        } 
        else if (index == 0) {
            start = start.next;
            start.previous = null;
        } 
        else if (index == maxCount - 1) {
            end = end.previous;
            end.next = null;
        } 
        else {
            Node<T> tmpNode = start;

            for (int i = 0; i < index; i++) {
                tmpNode = tmpNode.next;
            }

            tmpNode.previous.next = tmpNode.next;
            tmpNode.next.previous = tmpNode.previous;
        }
        maxCount--;
    }

    // Get First
    public T getFirst() {
        if (start == null) 
        current = start;
        return current.data;
    }

    // Get Last
    public T getLast(){
        if (end == null)
        current = end;
        return current.data;
    }

    // Get Next Node
    public T getNext() {
        if (current == null) return null;

        if (current.next == null) {
            current = start; // circular
        } else {
            current = current.next;
        }
        return current.data;
    }

    // Get Previous Node
    public T getPrevious() {
        if (current == null) return null;

        if (current.previous == null) {
            current = end; // circular
        } else {
            current = current.previous;
        }
        return current.data;
    }

    // Get using Index
    public T get(int index) {
        if (start == null || index < 0 || index >= maxCount) {
            return null;
        }

        Node<T> tmpNode = start;
        for (int i = 0; i < index; i++) {
            tmpNode = tmpNode.next;
        }
        return tmpNode.data;
    }

    public int getMaxCount() {
        return maxCount;
    }

  
//    public void sortByNameAsc() {
//        if (start == null) return;
//
//        for (Node<T> i = start; i != null; i = i.next) {
//            for (Node<T> j = i.next; j != null; j = j.next) {
//                Employee e1 = (Employee) i.data;
//                Employee e2 = (Employee) j.data;
//                if (e1.getName().compareToIgnoreCase(e2.getName()) > 0) {
//                    T temp = i.data;
//                    i.data = j.data;
//                    j.data = temp;
//                }
//            }
//        }
//    }
    
    
//    public void sortByNameDesc() {
//        if (start == null) return;
//
//        for (Node<T> i = start; i != null; i = i.next) {
//            for (Node<T> j = i.next; j != null; j = j.next) {
//                Employee e1 = (Employee) i.data;
//                Employee e2 = (Employee) j.data;
//                if (e1.getName().compareToIgnoreCase(e2.getName()) < 0) {
//                    T temp = i.data;
//                    i.data = j.data;
//                    j.data = temp;
//                }
//            }
//        }
//    }
    
    // Rest Pointer
    public void reset() {
        current = start;
    }
}