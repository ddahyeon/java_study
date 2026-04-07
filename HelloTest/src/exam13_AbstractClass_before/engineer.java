package exam13_AbstractClass_before;


public class engineer extends Employee {
	String skill;

	public engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}
	// name과 salary, skill를 리턴하는 메서드가 필요하다고 order가 옴
	@Override
	public String getEmployee() {
		return skill+"\t"+name+"\t"+salary;
	}
//	public Engineer() {
//		super();
//	}
	
}
