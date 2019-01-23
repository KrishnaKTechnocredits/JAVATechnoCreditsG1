package saket;

public class swapwiththirdvaiable {

	int a=10;
	int b=20;
	int c;
	
	void swap()
	{
	c=a;
	a=b;
    b=c;	
	System.out.println("a="+a);
	System.out.println("b="+b);
    };
	    public static void main(String[] args) {
		swapwiththirdvaiable A = new swapwiththirdvaiable();
		A.swap();
		
		// TODO Auto-generated method stub
		}

}
