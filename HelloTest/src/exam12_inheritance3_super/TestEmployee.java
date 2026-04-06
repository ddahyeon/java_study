package exam12_inheritance3_super;

public class TestEmployee {

	public static void main(String[] args) {
		manager m = new manager("홍길동",2000,"인사");
		engineer e = new engineer("유관순",1800,"자바");
		
		System.out.println(m.getManager());
		System.out.println(e.getEngineer());

	}

}
