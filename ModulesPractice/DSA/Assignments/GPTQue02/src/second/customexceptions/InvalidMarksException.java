package second.customexceptions;

public class InvalidMarksException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMarksException(String message) {
		super(message);
	}
}
