package exam13_AbstractClass_After;


public class engineer extends Employee {
	String skill;
	
	public engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}
	// name과 salary, skill를 리턴하는 메서드가 필요하다고 order가 옴
	public String getInfo() {
		return skill+"\t"+name+"\t"+salary;
	}
	//public Engineer() {
	//	super();
	//}
	
}
