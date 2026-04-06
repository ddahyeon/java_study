package exam12_inheritance1_before;

//엔지니
public class engineer {

	String name;
	int salary;
	String skill; //엔지니어 기술 
	
	public engineer() {}
	public engineer(String name, int salary, String skill) {
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
