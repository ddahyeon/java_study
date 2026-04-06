package exam12_inheritance5_Object_toString;

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

	@Override // source->override method 들어가면 자동으로 생성해줌  
	public String getEmployee() {
		return super.getEmployee()+"\t"+depart;
		//return name+"\t"+salary+"\t"+depart;
	}

	
}
