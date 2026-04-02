package in.cdac;

import java.util.ArrayList;

public class Program {

	
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
        // Create the thread objects
        Producer p = new Producer(list);
        Consumer c = new Consumer(list);

        // Fire them up!
        p.start();
        c.start();
		
	}
	

}
