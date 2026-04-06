package exam12_inheritance5_Object_toString;

//엔지니어   
// 엔지니어 is a Employee   
public class engineer extends Employee{

	//String name;
	//int salary;  상속받은 변수가 있기 때문에 없어도 
	String skill; //엔지니어 기술 
	
	//생성자 만들어줌 
	public engineer() {
		super();
	}


	public engineer(String name, int salary) {
		super(name, salary);
	}



	public engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}
	
	//getter
	//setter
	

	//public String getEngineer() {
	//	return name+"\t"+salary+"\t"+skill;}

	// 오버라이딩 
	@Override
	public String getEmployee() {
		return super.getEmployee()+"\t"+skill;
		//return name+"\t"+salary+"\t"+skill;
	}
}
