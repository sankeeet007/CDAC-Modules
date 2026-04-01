package in.cdac;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Transactions> trnxList = new ArrayList<>();
		int choice;
		
		do {
				System.out.println("1. Add record\n"
								 + "2. Transactions more than 5000\n"
								 + "3. Transactions where the txStatus is false.\n"
								 + "4. generate the amount Due\n"
								 + "5. Exit");
				choice = scanner.nextInt();
				
			switch(choice) {
			case 1:	
					{
					addRecord(scanner, trnxList);
					break;
					}
			case 2:	
					{
					System.out.println("Transactions more than 5000: ");
					List<Transactions> highValueTrnx = trnxList.stream()
				            					.filter(trnx -> trnx.getTxAmount() > 5000)       
				            					.collect(Collectors.toList());
					highValueTrnx.forEach(trnx -> System.out.println(trnx));
					break;
				}
			case 3:	{
					System.out.println("Transactions where the txStatus is false: ");
					List<Transactions> txStatusList = trnxList.stream()
				            					.filter(trnx -> !(trnx.isTxStatus()))       
				            					.collect(Collectors.toList());
					txStatusList.forEach(trnx -> System.out.println(trnx));
					break;
				}
			case 4:	{
					Function<Transactions, Float> calculateDueFunction = (trx) -> {
								if (trx.isTxArrears()) {
					                return (float) (trx.getTxAmount() + 500 + (0.18 * trx.getTxAmount()));
					            } else {
					                return trx.getTxAmount();
					            }
					};
					trnxList.forEach(trnx -> System.out.println(calculateDueFunction.apply(trnx)));
					break;
				}
			case 5:	{
					//Exit
					break;
				}
			}
		}while(choice!=5);

		scanner.close();
	}
	
	public static void addRecord(Scanner scanner, ArrayList<Transactions> trnxList) {
		System.out.println("*****Enter Transaction details*****");
		System.out.println("Enter Transaction Id: ");
		int trxId = scanner.nextInt();
		System.out.println("Enter Transaction Date: ");
		String trxDate = scanner.next();
		System.out.println("Enter Transaction Amount: ");
		float trxAmount = scanner.nextFloat();
		System.out.println("Enter Transaction Status: ");
		boolean trxStatus = scanner.nextBoolean();
		System.out.println("Enter Transaction Arrears: ");
		boolean trxArrears = scanner.nextBoolean();
		
		trnxList.add(new Transactions(trxId, trxDate, trxAmount, trxStatus, trxArrears));
	}

}
