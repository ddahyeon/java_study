package exam16_lambda;

//인터페이스
@FunctionalInterface
interface Flyer3{
	public abstract void fly(int n, int n2); // 하나의 추상메서드를 가지게끔  
	
}

public class TestMain3 {
	public static void main(String[] args) {
		// 익명클래스 파라미터가 있는 경우 (2개이상) 
		Flyer3 f = new Flyer3() {
			@Override
			public void fly(int n, int n2) {
				System.out.println("fly()"+n);
			}
		};
		f.fly(10,2);

		//파라미터가 있는 경우  (여러개) 
		Flyer3 f2 = (int n,int n2) -> {System.out.println("fly()_lambda"+n+n2);};
		f2.fly(20,30);
		
		Flyer3 f3 = (n,n2) -> {System.out.println("fly()_lambda2"+n+n2);};
		f3.fly(30,40);
	}

}
