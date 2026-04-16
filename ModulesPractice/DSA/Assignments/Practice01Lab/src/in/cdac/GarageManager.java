package in.cdac;

import java.util.ArrayList;
import java.util.List;

import in.cdac.Exceptions.BookingNotFoundException;
import in.cdac.Exceptions.InvalidBookingException;


public class GarageManager implements BookingService {
	List<Booking> bookings = new ArrayList<>();
	@Override
	public void addBooking(Booking b) throws InvalidBookingException{
		if(b.getServiceDate().isBefore(java.time.LocalDate.now())) {
			throw new InvalidBookingException("Booking Date cannot be Past Date.");
		}
		bookings.add(b);
	}

	@Override
	public void removeBooking(int id) throws BookingNotFoundException{
		boolean removed = bookings.removeIf(b -> b.getBookingId() == id);
		if(!removed) throw new BookingNotFoundException("Booking ID: " + id + " Not Found.");
	}

	@Override
	public void listBookings() {
		for(Booking b : bookings) {
			System.out.println(b);
		}
	}

	@Override
	public void displayBookingSummary() {
		// TODO Auto-generated method stub
		
	}

}
