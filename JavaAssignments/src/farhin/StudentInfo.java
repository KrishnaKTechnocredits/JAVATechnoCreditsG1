package farhin;

public class StudentInfo {
	
	public static void main(String[] a) {
		int rNo=Integer.parseInt(a[0]);
		String name=a[1];
		int marks=Integer.parseInt(a[2]);
		studentInfoDisplay(rNo,name,marks);
	}
		
	public static void studentInfoDisplay(int RollNo, String name, int mark )
		{
			System.out.println("RollNO is: "+RollNo+"\nName is: "+name+"\nMarks are: "+mark);
			
		}
		
	
	

}
