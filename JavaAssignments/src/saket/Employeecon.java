package saket;

import java.util.Scanner;

public class Employeecon {

	String name;
	int dep;
	int sal;

	Employeecon(String nme, int deptid, int salary) {

		this.name = nme;
		this.dep = deptid;
		this.sal = salary;

		System.out.println(name);
		System.out.println(dep);
		System.out.println(sal);

	}

	static void CompareEmpSal(Employeecon e1, Employeecon e2) {

		if (e1.sal > e2.sal) {

			System.out.println("max salary is" + e1.sal);
		} else {

			System.out.println("max salary is" + e2.sal);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the Employee name");

		String name = sc.nextLine();

		System.out.println("enter the Dept id");

		int dep = sc.nextInt();

		System.out.println("enter the Employee Salary");

		int sal = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);

		System.out.println("enter the Employee name");

		String name1 = sc1.nextLine();

		System.out.println("enter the Dept id");

		int dep1 = sc1.nextInt();

		System.out.println("enter the Employee Salary");

		int sal1 = sc1.nextInt();

		Employeecon e1 = new Employeecon(name, dep, sal);
		Employeecon e2 = new Employeecon(name1, dep1, sal1);

		CompareEmpSal(e1, e2);

	}
}
