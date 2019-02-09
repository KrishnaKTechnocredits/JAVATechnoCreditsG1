package amarja;
import java.util.Scanner;
/*Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using
scanner). Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both
employees) and print all the details of employee having max salary.
HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2);*/
public class Employee1 {
	int deptId;String empName;double salary;	
	public Employee1(int deptId1,String empName1,double salary1)
	{
		Scanner src=new Scanner(System.in);
		System.out.println("Enter Department Id:");
		deptId=src.nextInt();
		System.out.println("Enter employee Name :");
		empName=src.next();
		System.out.println("Enter Salary");
		salary=src.nextDouble();		
	}
	void compareEmpSalary(Employee1 e1, Employee1 e2)
	{
		 if  (e1.salary==e2.salary)
			 System.out.println("Salary are equal for both employees");
		 else
		 {
		if (e1.salary >e2.salary)
		{
			System.out.println("Details of Employee having maximum salary :");
			System.out.println("Department ID = "+ e1.deptId);
			System.out.println("Employee Name = "+ e1.empName);
			System.out.println("Salary = "+ e1.salary);
		}
		else
		{
			System.out.println("Details of Employee having maximum salary :");
			System.out.println("Department ID = "+ e2.deptId);
			System.out.println("Employee Name = "+ e2.empName);
			System.out.println("Salary = "+ e2.salary);			
		}
		 }
			
			}	
	public static void main (String args[])
	{
		Employee1 e1 =new Employee1 (0,null,0.0);
		Employee1 e2 =new Employee1 (0,null,0.0);
		e1.compareEmpSalary(e1, e2);	
	}
}
