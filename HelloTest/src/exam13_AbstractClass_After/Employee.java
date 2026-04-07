package exam13_AbstractClass_After;

//부모  
public class Employee { 
	String name;
	int salary;
		public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	// name과 salary를 리턴하는 메서드가 필요하다고 order가 옴
	public  String getEmployee() {
		return name+"\t"+salary;
	}
	
	

}
