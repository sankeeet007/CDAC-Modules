package in.cdac;

import java.util.Scanner;

public class Program03 {
	
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size for the Queue: ");
		int s = scanner.nextInt();
		
		QueueADT queueObj = new QueueADT(s);
		
		//queueObj.dequeue();
		queueObj.enqueue(10);
		queueObj.enqueue(20);
		queueObj.enqueue(30);
		queueObj.dequeue();
		queueObj.enqueue(60);
		queueObj.enqueue(40);
		queueObj.dequeue();
		queueObj.displayQueue();
		
		scanner.close();
	}
}
