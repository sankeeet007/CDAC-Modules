package in.cdac;

import java.time.LocalDate;
import java.util.function.Supplier;

// Lambda expression to print the current date

public class Program6 {

	public static void main(String[] args) {
		
		Supplier<LocalDate> supplierDateSupplier = () -> LocalDate.now();
		
		System.out.println("Current Date: " + supplierDateSupplier.get());

	}

}
