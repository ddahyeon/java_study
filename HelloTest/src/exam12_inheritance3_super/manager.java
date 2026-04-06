package exam12_inheritance3_super;

//관리자   
//매니저  is a Employee 
public class manager extends Employee{
	//String name;
	//int salary;
	String depart; // 관리부서   
	
	//생성자 작성을 generate으로     
	public manager() {
		super();
	}

	public manager(String name, int salary) {
		super(name, salary);
	}
	
	//depart 생성자 만들어줌 (name, salary가 포함된것까지)   
	public manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	//getter
	//setter
	public String getManager() {
		return name+"\t"+salary+"\t"+depart;
	}

	
	
	

	
}
