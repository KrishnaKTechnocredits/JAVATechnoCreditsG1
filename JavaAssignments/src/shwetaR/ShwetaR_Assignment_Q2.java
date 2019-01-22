package shwetaR;

public class ShwetaR_Assignment_Q2 {
	public static void main(String[] args) {

		int rollNo = Integer.parseInt(args[0]);
		String name = args[1];
		int marks = Integer.parseInt(args[2]);
		student(args[0],args[1],args[2]);
	}
		
		static void student(String rollNo, String name,String marks){
			
		System.out.println(rollNo + " " + name + " " + marks);
		}

}
