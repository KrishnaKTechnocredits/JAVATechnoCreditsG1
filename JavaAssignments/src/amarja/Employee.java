package amarja;
import java.util.Scanner;
/*Create Employee class and parameterized constructor with attributes empId , empName and
salary. Write a method to display the details of employees. Create a TestEmployee class to test
Employee class functionality.*/
public class Employee {
	int empId;String empName;double salary;	
	//3 parameterized constructor with attributes empId , empName and salary. 
	public Employee(int empId1,String empName1,double salary1)
	{
		Scanner src=new Scanner(System.in);
		System.out.println("Enter employee Id:");
		empId=src.nextInt();
		System.out.println("Enter employee Name :");
		empName=src.next();
		System.out.println("Enter Salary");
		salary=src.nextDouble();
		src.close();
	}
	void display (int empId,String empName,double salary)
	{	
		System.out.println("Details of Employee :");
		System.out.println("Employee ID = "+ empId);
		System.out.println("Employee Name = "+ empName);
		System.out.println("Salary = "+ salary);
	}
}
