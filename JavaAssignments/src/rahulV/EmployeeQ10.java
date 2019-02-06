package rahulV;

import java.util.Scanner;

public class EmployeeQ10 {

	int empId, salary;
	String empName;

	EmployeeQ10(int empId, String empName, int salary) { // parameterized constructor
		this.empId = empId; // assigning parameters into instance variable
		this.empName = empName;
		this.salary = salary;
	}

	void displayInfo() { // display the details of employee
		System.out.println("Name: " + empName + " Employee Id: " + empId + "  Salary: " + salary);
	}

}
