package complex;

public class Complex {
	double real,imag;
	
	public Complex(double r, double i) {
		this.real = r;
		this.imag = i;
	}
	
	public static Complex sum(Complex n1, Complex n2) {
		return new Complex(n1.real+n2.real, n1.imag+n2.imag);
	}
	
	public static Complex diff(Complex n1, Complex n2) {
		return new Complex(n1.real-n2.real, n1.imag-n2.imag);
	}
	
	public static Complex product(Complex n1, Complex n2) {
		return new Complex(
				(n1.real * n2.real) - (n1.imag * n2.imag),
	            (n1.real * n2.imag) + (n1.imag * n2.real)
	            );
	}
	
	public void display() {
		if(imag >= 0) {
			System.out.println(real+" + "+imag+"i");
		}
		else {
			System.out.println(real+" - "+Math.abs(imag)+"i");
		}
	}
}
