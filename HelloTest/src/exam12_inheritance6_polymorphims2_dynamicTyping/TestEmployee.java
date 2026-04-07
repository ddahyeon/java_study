package exam12_inheritance6_polymorphims2_dynamicTyping;

public class TestEmployee {

	public static void main(String[] args) {
		
		 //다형성을 적용안한 경우
		manager m = new manager();
		m.a();
		Employee em = new Employee();
		em.a();
		
		//다형성
		Employee e = new manager();
		e.a();
		//e.b();
		//e.name;
		manager m1 = (manager)e;
		m1.b();
		System.out.println(m1.name);
	
	}

}
