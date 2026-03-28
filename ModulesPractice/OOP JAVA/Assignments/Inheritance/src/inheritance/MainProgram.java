package inheritance;

public class MainProgram {

	public static void main(String[] args) {
		//method of parent class by object of parent class
		Base objBase = new Base();
		objBase.print();
		
		// method of child class by object of child class
		Derived objDerived = new Derived();
		objDerived.print();
		
		//method of parent class by object of child class
		Base objDerived2 = new Derived();
		//Derived objDerived3 = (Derived) objDerived2;
		objDerived2.print();
		
//		Derived newoibjDerived = (Derived) new Base();
	}

}
