package in.cdac.Chaining;

public class HashTableLinkedListChaining implements HashTable{
	private LinkedList buckets[];
	private int size;
	
	public HashTableLinkedListChaining() {
		size = 10;
		buckets = new LinkedList[size];
		for(int i=0; i<buckets.length; i++) {
			buckets[i] = new LinkedList();
		}
	}
	
	private int hashFun(int key) {
		return key%10;
	}
	@Override
	public void insert(int key) {
		int headId = hashFun(key);
		
		System.out.println("Storing key: "+ key + " in HeadArray #" + headId);
		buckets[headId].add(key);
	}

	@Override
	public boolean search(int key) {
		int headId = hashFun(key);
		return buckets[headId].search(key);
		
	}
	
	public void display() {
		for(int i=0; i<buckets.length; i++) {
			System.out.println( (i) + "--->" + buckets[i].display());		
		}
	}
}
