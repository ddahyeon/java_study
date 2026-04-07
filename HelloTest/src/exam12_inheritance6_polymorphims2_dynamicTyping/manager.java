package exam12_inheritance6_polymorphims2_dynamicTyping;

//관리자   
//매니저  is a Employee 
public class manager extends Employee{
String name;
	
	@Override
	public void a() {
		System.out.println("Manager a()");
	}

	public void b() {
		System.out.println("Manager b()");
	}

	
	
}
