package saket;

public class Employee {

	int Emppid;
	String Empname;
	int esalary;

	Employee(int empid, String empname, int salary) {

		this.Emppid = empid;
		this.Empname = empname;
		this.esalary = salary;
	}

	void display() {

		System.out.println(Emppid);

		System.out.println(Empname);
		System.out.println(esalary);

	}

}
