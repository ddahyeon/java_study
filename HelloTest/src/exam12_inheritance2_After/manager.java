package exam12_inheritance2_After;

//관리자   
//매니저  is a Employee 
public class manager extends Employee{
	//String name;
	//int salary;
	String depart; // 관리부서   
	
	public manager() {}
	public manager(String name, int salary, String depart) {
		System.out.println("manager 생성자");
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	
	//getter
	//setter
	public String getManager() {
		return name+"\t"+salary+"\t"+depart;
	}
	
	

	
}
