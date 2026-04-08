package exam16_lambda;

//인터페이스
@FunctionalInterface
interface Flyer4{
	public abstract String fly(); 
	
}

public class TestMain4 {
	public static void main(String[] args) {
		// 익명클래스 파라미터가 없고 리턴이 있을떄  
		Flyer4 f = new Flyer4() {
			@Override
			public String fly() {
				return "hello";
			}
		};
		String s = f.fly();
		System.out.println(s);

		//파라미터가 있는 경우  (여러개) 
		Flyer4 f2 = () -> {return "hello2";};
		
		Flyer4 f3 = () -> {return "hello3";};
		
		String s2 = f2.fly();
		System.out.println(s2);
		String s3 = f3.fly();
		System.out.println(s3);
		
	}

}
