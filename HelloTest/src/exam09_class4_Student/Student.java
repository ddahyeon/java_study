package exam09_class4_Student;

public class Student {
	String name;
	int age;
	String address;
	
	public Student() { //쓰든 안쓰든 무조건 만들 예정 
		

	}

	public Student(String name, int age, String address) { //파라미터를 가진 생성자를 만들어줌 
		this.name = name;
		this.age = age;
		this.address = address;  
	} //주소 아는 사람들은 이 생성자 활

	public Student(String name, int age) { // 주소를 모르는 사람은 이 생성
		this(name,age,null);
	//	this.name = name;
	//	this.age = age;
	}
	
	
	

}
