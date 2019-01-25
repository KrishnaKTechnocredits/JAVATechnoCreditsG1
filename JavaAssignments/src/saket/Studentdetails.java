package saket;

public class Studentdetails {
	
	int rollnum;
	String name;
	int marks;
	

	public static void main(String[] args) {
		
		
		Studentdetails A=new Studentdetails();
		
		int a=Integer.parseInt(args[0]);
		String b=args[1];
		int c=Integer.parseInt(args[2]);
		
		A.setdata(a,b,c);	
		A.display(a,b,c);
		
	}
		
	void setdata(int a,String b,int c)
	{
		
		rollnum=a;
		name=b;
		marks=c;
		
	}	 
		
		
void display(int a,String b,int c )
	{
	System.out.println("Roollnum is " + rollnum );
    System.out.println("Name of the Student is " + name );
	System.out.println("marks of the student " + name + " is " + marks);

	} 

}
