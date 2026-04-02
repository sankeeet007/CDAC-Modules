package in.cdac;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Producer extends Thread{
	private final int MAX_CAPACITY = 100;
    private final int RESUME_THRESHOLD = 20;
    private boolean isPaused = false;
    
	private ArrayList<String> otpPool;
    
    public Producer(ArrayList<String> otpPool) {
        this.otpPool = otpPool;
    }
    
    @Override
	public void run(){
		try {
        while (true) {
        	synchronized (otpPool) {
	            while (otpPool.size() == MAX_CAPACITY) {
	                System.out.println("Buffer Full (100). Producer Pausing...");
	                isPaused = true;
	                otpPool.wait();
	            }
	
	            // Stay paused until buffer falls to 20
	            if (isPaused && otpPool.size() > RESUME_THRESHOLD) {
	                otpPool.wait();
	            }
	
	            isPaused = false; // Resume production
	            
	            // Opt Generation logic
	            final char[] vowel= {'A','E','I','O','U'};
	    		StringBuffer str = new StringBuffer("");
	    		str.append(vowel[(int)(Math.random()*4)]);
	    		
	    		Supplier<String> otpGeneratorSupplier = () -> {
	    			for(int i=0; i<4; i++) {
	    				int random = (int)(Math.random()*10);
	    				str.append(random);
	    			}
	    			return str.toString();
	    		};
	    		String otp = otpGeneratorSupplier.get();
	            otpPool.add(otp);
	    		
	            System.out.println("Produced: " + otp + " | Buffer Size: " + otpPool.size());
	            
	            otpPool.notifyAll(); // Wake up consumer
        	}
            Thread.sleep(50); // Small delay to visualize output
        }
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
    }
}
