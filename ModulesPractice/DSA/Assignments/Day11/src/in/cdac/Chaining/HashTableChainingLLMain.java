package in.cdac.Chaining;

public class HashTableChainingLLMain {
	public static void main(String[] args) {
		HashTableLinkedListChaining HTable = new HashTableLinkedListChaining();
		
		HTable.insert(23);
		HTable.insert(11);
		HTable.insert(45);
		HTable.insert(53);
		HTable.insert(69);
		HTable.insert(56);
		System.out.println(HTable.search(53));	
		HTable.display();
	}
}
