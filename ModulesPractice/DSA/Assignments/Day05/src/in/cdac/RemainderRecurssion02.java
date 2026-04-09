package in.cdac;

	public class RemainderRecurssion02 {
		
		public static int remainder(int a, int b) {
			if(a < b ) return a;
			a = a - b;
			
			return remainder(a, b);
		}
		
		public static int divide(int a, int b) {
			if(b == 0) throw new RuntimeException("Divide by 0 Exception");
			
			boolean isNegative;
			isNegative = ((a<0) ^ (b<0)) ? true : false;
			
			 a = Math.abs(a);
			 b = Math.abs(b);
			 int ans = remainder(a, b);
			 ans = (isNegative) ? -ans : ans;
			 return ans;
		}
		public static void main(String[] args) {
		
			System.out.println("12 % 5 = " + divide(12, 5));
			System.out.println("-7 % 2 = " + divide(-7, 2));
			System.out.println("45 % -7 = " + divide(45, -7));
			System.out.println("12 % 0 = " + divide(12, 0));
		}
	

}
