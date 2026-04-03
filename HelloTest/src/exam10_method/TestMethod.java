package exam10_method;

public class TestMethod {

	public static void main(String[] args) {
		Method m = new Method(); //객체생성   
		
		// 1번 경우  
		m.method();
		
		// 2번 경우  
		m.method2(2,"룰루");
		
		// 3번 경우 
		int num = m.method3();
		System.out.println("리턴값: " + num);
		
		//4번 경우 
		int sum = m.method4(1, 2);
		System.out.println("리턴값: " + sum);

	}

}
