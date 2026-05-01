package first.CustomExceptions;

public class InvalidEnrollmentException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3324735718309317545L;

	public InvalidEnrollmentException(String message) {
		super(message);
	}
}
