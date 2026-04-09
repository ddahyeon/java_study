package exam18_exception;

class Test2{
	public void a() {
		b();
	}
	public void b() throws NullPointerException, ArithmeticException{ // throws 여러 종류의 예외로 위임해줄 수 있음  
		//NullPointerException	발생 가능 
			String s = null;
			System.out.println(s.length());
			
			//ArithmeticException 발생 가능  
			int n=0;
			int result=10/n;
			System.out.println("결과: "+result);
			
	}
}

public class ExceptionTest5 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Test2 t = new Test2();
		try {
			t.a();
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 정상종료");
		
		
	}

}
