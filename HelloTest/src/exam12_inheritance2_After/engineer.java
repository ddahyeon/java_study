package exam12_inheritance2_After;

//엔지니어   
// 엔지니어 is a Employee   
public class engineer extends Employee{

	//String name;
	//int salary;  상속받은 변수가 있기 때문에 없어도 
	String skill; //엔지니어 기술 
	
	public engineer() {}
	public engineer(String name, int salary, String skill) {
		System.out.println("engineer 생성자");
		this.name = name;
		this.salary = salary;
		this.skill = skill;
	}
	//getter
	//setter
	
	public String getEngineer() {
		return name+"\t"+salary+"\t"+skill;
		
	}
	
}
