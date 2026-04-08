package exam16_lambda;

//인터페이스
@FunctionalInterface
interface Flyer5{
	public abstract int fly(int n, int n2); 
	
}

public class TestMain5 {
	public static void main(String[] args) {
		// 익명클래스 파라미터가 있고  리턴이 있을떄  
		Flyer5 f = new Flyer5() {
			@Override
			public int fly(int n, int n2) {
				return n+n2;
			}
		};
		int n = f.fly(10,20);
		System.out.println(n);

		//파라미터가 있고, 리턴값이 있을때   
		Flyer5 f2 = (int x, int x2) -> {return x+x2;};
		
		Flyer5 f3 = (int x, int x2) -> {return x+x2;};
		
		int n4 = f2.fly(20,20);
		System.out.println(n4);
		int n3 = f3.fly(20,30);
		System.out.println(n3);
		
	}

}
