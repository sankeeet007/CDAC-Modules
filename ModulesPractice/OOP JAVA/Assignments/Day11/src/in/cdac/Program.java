package in.cdac;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Transactions> trnxList = new ArrayList<>();
		
		while(true) {
			System.out.println("*****Enter Transaction details*****");
			System.out.println("Enter Transaction Id: ");
			int trxId = scanner.nextInt();
			System.out.println("Enter Transaction Date: ");
			String trxDate = scanner.nextLine();
			System.out.println("Enter Transaction Amount: ");
			int trxAmount = scanner.nextInt();
			System.out.println("Enter Transaction Status: ");
			boolean trxStatus = scanner.nextBoolean();
			System.out.println("Enter Transaction Arrears: ");
			boolean trxArrears = scanner.nextBoolean();
			
			trnxList.add(new Transactions(trxId, trxDate, trxAmount, trxStatus, trxArrears));
			
			System.out.println("Do you want to add more? (true/false):  ");
			boolean Choice = scanner.nextBoolean();
			if(Choice==false) {
				break;
			}
		}
		
		
		scanner.close();
	}

}
