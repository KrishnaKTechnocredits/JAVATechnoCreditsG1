package saket;

public class Addition {

	void add(int a, int b) {
		int c = a + b;

		System.out.println(c);

	}

	void add(float a, float b) {
		double c = a + b;

		System.out.println(c);

	}

	void add(String a, String b) {
		String c = a + b;
		System.out.println(c);

	}

	public static void main(String[] args) {

		Addition a1 = new Addition();
		a1.add("saket", "akash");

	}

}
