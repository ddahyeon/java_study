package exam12_inheritance6_polymorphims;

public class TestEmployee {

	public static void main(String[] args) {
		
		//다형성이 적용 안된 방식   
		manager m = new manager("홍길동",2000,"인사");
		engineer e = new engineer("유관순",1800,"자바");
	
		//참조변수 출력  	
		System.out.println(m);
		System.out.println(e); 
	
	}

}
