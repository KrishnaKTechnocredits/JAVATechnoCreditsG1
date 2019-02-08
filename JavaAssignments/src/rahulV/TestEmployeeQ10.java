package rahulV;

import java.util.Scanner;

public class TestEmployeeQ10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the employee Id: ");
		int empId = scanner.nextInt();

		System.out.println("Enter the name of employee: ");
		String empName = scanner.next();
		System.out.println("Enter the salary of employee: ");
		int salary = scanner.nextInt();

		EmployeeQ10 employee = new EmployeeQ10(empId, empName, salary);
		employee.displayInfo();

	}

}
