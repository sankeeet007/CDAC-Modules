package in.cdac;

import java.util.ArrayList;

	public class Consumer extends Thread {
	    private final int RESUME_THRESHOLD = 20;
	   	    private final ArrayList<String> otpPool;

		public Consumer(ArrayList<String> otpPool){
			this.otpPool = otpPool;
		}
		public void run() {
			try {
	        while (true) {
	        	synchronized (otpPool) {
				
		            while (otpPool.isEmpty()) {
		            	otpPool.wait();
		            }
	
		            String otp = otpPool.remove(0);
		            System.out.println("Consumed: " + otp + " | Remaining: " + otpPool.size());
	
		            // Check if we hit the low Threshold
		            if (otpPool.size() == RESUME_THRESHOLD) {
		                System.out.println("Buffer at 20. Waking up Producer!");
		                otpPool.notifyAll();
		            }
	        	}
	            Thread.sleep(100); // Consumer is slightly slower than producer
	        }
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	    }
}
