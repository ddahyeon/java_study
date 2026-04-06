package exam12_inheritance5_Object_toString;

public class TestEmployee {

	public static void main(String[] args) {
		manager m = new manager("홍길동",2000,"인사");
		engineer e = new engineer("유관순",1800,"자바");
		
		System.out.println(m.getEmployee());

		//참조변수 출력  	
		System.out.println(m);
		System.out.println(m.toString()); //Object의 toString 
		//exam12_inheritance5_Object_toString.manager@1c655221 이런 형태  
	}

}
