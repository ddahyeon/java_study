package exam16_lambda;

//인터페이스
@FunctionalInterface
interface Flyer2{
	public abstract void fly(int n); // 하나의 추상메서드를 가지게끔  
	
}

public class TestMain2 {
	public static void main(String[] args) {
		// 익명클래스 파라미터가 있는 경우   
		Flyer2 f = new Flyer2() {
			@Override
			public void fly(int n) {
				System.out.println("fly()"+n);
			}
		};
		f.fly(10);

		//파라미터가 있는 경우  
		Flyer2 f2 = (int n) -> {System.out.println("fly()_lambda"+n);};
		f2.fly(20);
		
		Flyer2 f3 = (n) -> {System.out.println("fly()_lambda2"+n);};
		f3.fly(30);
	}

}
