package exam12_inheritance1_before;

//관리자   
public class manager {
	String name;
	int salary;
	String depart; // 관리부서   
	
	public manager() {}
	public manager(String name, int salary, String depart) {
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
