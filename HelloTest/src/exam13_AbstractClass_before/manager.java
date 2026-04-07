package exam13_AbstractClass_before;


public class manager extends Employee{
	String depart;

	public manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
	// name과 salary, depart를 리턴하는 메서드가 필요하다고 order가 옴
//	public String getNameSalaryDepart() {
//		return depart+"\t"+name+"\t"+salary;
//	}
	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return depart+"\t"+name+"\t"+salary;
	}
	
}
