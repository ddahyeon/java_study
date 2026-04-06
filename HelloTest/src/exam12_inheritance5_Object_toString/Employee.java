package exam12_inheritance5_Object_toString;

public class Employee {  // 자동으로 extends object가 지정됨  
	String name;
	int salary;  //두개의 클래스에서 공통적으로 있는 변수를 뽑음  
	
	public Employee() {
		System.out.println("Employee 생성자 부모");
	}

	public Employee(String name, int salary) {
		System.out.println("Employee 생성자22");
		this.name = name;
		this.salary = salary;
	}
	
	//getter
	//setter
	
	public String getEmployee() {
		return name+"\t"+salary;
	}
	
	

}
