package randomQuestions;

public class Emp {

	public int empId; 
	String empName; 
	public Address address; 
	public Emp(int empId, String empName, Address address) {
		this.empId = empId; 
		this.empName= empName; 
		this.address = address; 
	}
	
	public void call() {
		System.out.println(empId+" "+empName);
		System.out.println(address.street+" "+address.city+" "+address.state);
	}
	
	public static void main(String[] args) {
		Address a1 = new Address(1126, "Bethal Park", "PA"); 
		Address a2 = new Address(1136, "Pittsburg", "PA");
		System.out.println(a1);
		Emp e1 = new Emp(1000, "Ravi", a1); 
		Emp e2 = new Emp(1001, "Prathik", a2); 
		e1.call(); 
		e2.call();
		
	}
}
