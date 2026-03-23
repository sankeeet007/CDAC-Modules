class Boolean{
	public static void main(String args[]){
		String str="Python Exercises";
		String str1="Python Exercise";
		
		int size=str1.length();
	    if(str1.charAt(size-2)=='s' && str1.charAt(size-1)=='e'){
	        System.out.println("True");
	    }
	    else{
	        System.out.println("False");
	    }
	}
}