package first.CustomExceptions;

public class RecordNotFoundException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1146651728534226452L;

	public RecordNotFoundException(String message) {
		super(message);
	}
}
