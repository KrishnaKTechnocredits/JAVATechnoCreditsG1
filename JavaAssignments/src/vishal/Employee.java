package vishal;

public class Employee {
	
	int empId;
	String empName;
	int salary;
	
	Employee(int empId,String empName,int salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
	public void displayEmployeeDetails()
	{
		System.out.println("Emp. id is "+empId);
		System.out.println("Emp. name is "+empName);
		System.out.println("Salary is "+salary);
	}

}
