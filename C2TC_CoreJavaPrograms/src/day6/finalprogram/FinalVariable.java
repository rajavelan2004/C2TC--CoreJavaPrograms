package day6.finalprogram;

public class FinalVariable {
	 int x = 100;

	// Declare a static blank final variable.
	 static int y;

	// Declare & initialize static final variable.
	 static int z= 10;

	// instance method
	void change() {
		x = 30; // final variables can't be reassigned
		y= 200; // final static variables can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", y" + y+ "]";
	}

	// Declare a static block to initialize the final static variable.
	static {
		y = 20;
		z = 100; // Once initialized can't be reassigned
		System.out.println("Value of y: " + y);
	}
}


