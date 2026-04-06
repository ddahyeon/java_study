package exam12_inheritance6_polymorphims;

//엔지니어   
// 엔지니어 is a Employee   
public class engineer extends Employee{


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
	
	//toString 재정의  
	@Override
	public String toString() {
		return "engineer [skill=" + skill + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
