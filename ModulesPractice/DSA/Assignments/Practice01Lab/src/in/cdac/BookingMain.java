package in.cdac;

import in.cdac.Exceptions.InvalidBookingException;

public class BookingMain {

	public static void main(String[] args) throws InvalidBookingException {
		GarageManager god = new GarageManager();
		god.addBooking(new Customer("Sanket", "MH12UY9043", ServiceType.REPAIR));
		god.listBookings();
	}
}
