class Main{
	public static void main(String args[]){
	    
	    String str="The quick brown fox jumps over the lazy dog.";
		for(char i='a';i<='z';i++){
		    int index=str.indexOf(i);
		    System.out.println(i+ "->"+index);
		}
	}
}