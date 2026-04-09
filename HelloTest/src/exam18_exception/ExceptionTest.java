package exam18_exception;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int n = 2; // 0을 넣는다면 중간에 종료되어 프로그램 정상종료 호출이 안됨  (java에서는 0으로 나눌 수가 없음)
		int result = 10/n;
		System.out.println("결과: "+result);
		
		
		
		System.out.println("프로그램 정상종료");

	}

}
