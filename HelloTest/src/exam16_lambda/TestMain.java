package exam16_lambda;

//인터페이스
@FunctionalInterface
interface Flyer{
	public abstract void fly(); // 하나의 추상메서드를 가지게끔  
	
}

public class TestMain {
	public static void main(String[] args) {
		// 익명클래스  
		Flyer f = new Flyer() {
			@Override
			public void fly() {
				System.out.println("fly()");
			}
		};
		f.fly();

		//람다표현식 ->를 사용함 간소화됨  
		Flyer f2 = () -> {System.out.println("fly()_lambda");};
		f2.fly();
		
		Flyer f3 = () -> {System.out.println("fly()_lambda2");};
		f3.fly();
	}

}
