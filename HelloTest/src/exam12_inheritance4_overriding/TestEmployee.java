package exam12_inheritance4_overriding;

public class TestEmployee {

	public static void main(String[] args) {
		manager m = new manager("홍길동",2000,"인사");
		engineer e = new engineer("유관순",1800,"자바");
		
		System.out.println(m.getEmployee());
		System.out.println(e.getEmployee());

	}

}
