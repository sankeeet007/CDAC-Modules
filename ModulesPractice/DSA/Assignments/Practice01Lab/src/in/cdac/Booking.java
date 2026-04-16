package in.cdac;
import java.time.LocalDate;
public abstract class Booking{
	private static int IdCounter = 1;
	private int bookingId;
	private String customerName;
	private String vehicleNumber;
	private ServiceType serviceType;
	private LocalDate serviceDate;
	
	public Booking(String customerName, String vehicleNumber, ServiceType sType) {
		this.bookingId = IdCounter++;
		this.customerName = customerName;
		this.vehicleNumber = vehicleNumber;
		this.serviceType = sType;
		this.serviceDate = LocalDate.now();
	}
	
	public int getBookingId() { return bookingId; }
    public ServiceType getServiceType() { return serviceType; }
    public LocalDate getServiceDate() { return serviceDate; }

	public abstract double calculateServiceCost();

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", customerName=" + customerName + ", vehicleNumber=" + vehicleNumber
				+ ", serviceType=" + serviceType + ", serviceDate=" + serviceDate + "]";
	}
	
	
}
