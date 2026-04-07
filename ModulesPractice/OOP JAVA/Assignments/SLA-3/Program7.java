
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Program7 {
	public static void main(String args[]) {
		ArrayList<String> arrList=new ArrayList<>();
		arrList.add("Red");
		arrList.add("Green");
		arrList.add("Blue");
		arrList.add("Grey");
		arrList.add("Black");
		arrList.add("Brown");
		
		Collections.sort(arrList);
        
		Iterator<String> iter= arrList.iterator();
    	while(iter.hasNext()) {
    		String data=iter.next();
    		System.out.println(data);
	}
	
	
	}
}


