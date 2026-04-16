package in.cdac;


import in.cdac.Exceptions.*;

public interface BookingService {
	public void addBooking(Booking b) throws InvalidBookingException;
	public void removeBooking(int id) throws BookingNotFoundException;
	public void listBookings();
	public void displayBookingSummary();
}
