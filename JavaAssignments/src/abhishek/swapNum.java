package abhishek;

public class swapNum {
	int a = 10;
	int b = 20;
	static void swap(int a,int b) {
		a=a+b;
		b=a-b;
	    a=a-b;	
	    System.out.println(a+"  "+b);
		
	}
	public static void main(String[] args) {
		swap(90, 80);
		
	}
}
