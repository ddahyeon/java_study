package exam15_익명클래스;

public class TestMain {
	public static void main(String[] args) {
		//다형성  적용한  이름있는 클래스 
		Flyer f = new Bird();
		f.fly(); 
		f.land();
		
		
		//다형성 적용한 익명클래스  
		Flyer f2 = new Flyer(){
			@Override
			public void fly() {
				System.out.println("익명클래스 .fly()"); // 재정의 해줘야함 
			}
			public void land() {
				System.out.println("land.land()");
				
			}
		};
		f2.fly();
		f2.land();
	}
}
