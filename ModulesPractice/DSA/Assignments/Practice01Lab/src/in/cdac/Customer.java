package in.cdac;


public class Customer extends Booking{
	public Customer(String name, String vehicleNumber, ServiceType sType) {
		super(name, vehicleNumber, sType);
	}


	@Override
	public double calculateServiceCost() {
		
		return 0;
	}

	
}
