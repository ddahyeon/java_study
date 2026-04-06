package exam12_inheritance6_polymorphims;

public class TestEmployee2 {

	public static void main(String[] args) {
		
		//다형성이 적용된 방식   
		Employee e= new manager("홍길동",2000,"인사");
		System.out.println(e);
				e= new manager("유관순",1800,"자바");
		System.out.println(e); 
	
	
	
		
	
	}

}
