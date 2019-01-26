package saket;

public class simpleintrest {

	int P = 1500;
	int T = 5;
	float R = 0.8f;
	double I;

	void simpleIR() {
		I = (P * T * R) / 100;
	}

	public static void main(String[] args) {
		simpleintrest A = new simpleintrest();
		A.simpleIR();
		System.out.println("Simple Interest is "+ A.I);
	}
	
}
