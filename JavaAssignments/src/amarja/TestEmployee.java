package amarja;
//Testing employee class function
public class TestEmployee {
		public static void main(String[] args) {
		Employee empr =new Employee(1234,"Amarja",890000000);
		empr.display(empr.empId,empr.empName,empr.salary);
		}
}
