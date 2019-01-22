package abhishek;

public class swapNumber {
static void swapnumber(int a,int b) {
	int c = a+b;//30
	    a =c-a;//30
	    b =c-b;
	System.out.println("a value is "+a+",b value is "+b);
}
public static void main(String[] args) {
	swapnumber(100,200);
}
}
