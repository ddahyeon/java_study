package exam12_inheritance6_polymorphims2_dynamicTyping;

//관리자
//엔지니어   is a Employee (상속관계)  
public class engineer extends Employee{


	@Override
	public void a() {
		System.out.println("Engineer a()");
	}
	public void c() {
		System.out.println("Engineer c()");
	}
	
}
