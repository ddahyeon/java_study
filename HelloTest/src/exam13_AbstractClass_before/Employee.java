package exam13_AbstractClass_before;

//부모  
public abstract class Employee { 
	String name;
	int salary;
		public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	// name과 salary를 리턴하는 메서드가 필요하다고 order가 옴
	public abstract String getEmployee();
	
	

}
