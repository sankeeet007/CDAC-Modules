package batch2;

public class ConsoleInput {
	
	static String getString() {
		try 
		{
			byte[] input = new byte[100];
			
			int len = System.in.read(input);
			
			byte[] finalInput = new byte[len-2];
			
			System.arraycopy(input, 0, finalInput, 0, len-2);
			
			String objString = new String(finalInput);
			
			return objString;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static float getFloat() {
			String data = getString();	
			return Float.parseFloat(data);
	}
	
	public static int getInt() {
		String data = getString();	
		return Integer.parseInt(data);
	}
	
	public static float getDouble() {
		String data = getString();	
		return Float.parseFloat(data);
	}
	
}
