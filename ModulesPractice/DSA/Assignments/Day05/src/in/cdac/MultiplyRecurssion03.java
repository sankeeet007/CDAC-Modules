package in.cdac;

public class MultiplyRecurssion03 {
		static int multiple=0;
		public static int multiply(int a, int b) {
			if(b == 0) return multiple;
			multiple+=a;
			b--;
			return multiply(a, b);
		}
		
		public static int Multiplication(int a, int b) {
			if(b == 0) return 0;
			
			boolean isNegative;
			isNegative = ((a<0) ^ (b<0)) ? true : false;
			
			 a = Math.abs(a);
			 b = Math.abs(b);
			 int ans = multiply(a, b);
			 ans = (isNegative) ? -ans : ans;
			 multiple = 0;
			 return ans;
		}
		public static void main(String[] args) {
		
			System.out.println("12 * 5 = " + Multiplication(12, 5));
			System.out.println("-7 * 2 = " + Multiplication(-7, 2));
			System.out.println("45 * -7 = " + Multiplication(45, -7));
			System.out.println("12 * 0 = " + Multiplication(12, 0));
		}
	

}

