package vishal;

import java.util.Scanner;

public class Employe {

	String employeName;
	int deptId;
	int salary;
	Scanner sc = new Scanner(System.in);
	Employe e1;
	Employe e2;

	Employe() {

	}

	Employe(String employeName, int salary, int deptId) {
		this.employeName = employeName;
		this.deptId = deptId;
		this.salary = salary;
	}

	void enterUserDetails() {
		System.out.println("Enter name of Employee1");
		String nameE1 = sc.next();
		System.out.println("Enter sal of Employee1");
		int salE1 = sc.nextInt();
		System.out.println("Enter Dept Id of Employee1");
		int deptIdE1 = sc.nextInt();

		System.out.println("Enter name of Employee2");
		String nameE2 = sc.next();
		System.out.println("Enter sal of Employee2");
		int salE2 = sc.nextInt();
		System.out.println("Enter Dept Id of Employee2");
		int deptIdE2 = sc.nextInt();

		e1 = new Employe(nameE1, salE1, deptIdE1);
		e2 = new Employe(nameE2, salE2, deptIdE2);

	}

	void compareEmpSalary(Employe e1, Employe e2) {
		System.out.println(e1.salary);
		System.out.println(e2.salary);
		if (e1.salary > e2.salary) {

			System.out.println("Name of the Higher Salary Employee " + e1.employeName);
			System.out.println("DeptId of Higher Salary Employee " + e1.deptId);
			System.out.println("Salary of Employee " + e1.salary);
		} else {
			System.out.println("Name of the Higher Salary Employee " + e2.employeName);
			System.out.println("DeptId of the Higher Salary Employee " + e2.deptId);
			System.out.println("Salary of  Employee " + e2.salary);
		}

	}

	public static void main(String[] args) {
		Employe e3 = new Employe();
		e3.enterUserDetails();
		e3.compareEmpSalary(e3.e1, e3.e2);

	}

}
