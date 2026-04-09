package in.cdac;

public class QuotientRecurssion01 {
	
	static int count=0;
	public static int quotient(int a, int b) {
		if(a == 0) return 0;
		a = a - b;
		count++;
		return quotient(a, b);
	}
	
	public static int divide(int a, int b) {
		if(b == 0) throw new RuntimeException("Divide by 0 Exception");
		
		boolean isNegative;
		isNegative = ((a<0) ^ (b<0)) ? true : false;
		
		 a = Math.abs(a);
		 b = Math.abs(b);
		 quotient(a, b);
		 int ans = count;
		 ans = (isNegative) ? -ans : ans;
		 count = 0;
		 return ans;
	}
	public static void main(String[] args) {
	
		System.out.println("12 / 2 = " + divide(12, 2));
		System.out.println("-12 / 2 = " + divide(-12, 2));
		System.out.println("12 / -2 = " + divide(12, -2));
		System.out.println("12 / 0 = " + divide(12, 0));
	}
}
