package exam18_exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		try {  // 예외가 발생되면 catch를 반환하여 정상종료 , 정상처리가 이루어지면 catch는 실행안됨  
			
			// ArithmeticException 발생 가능성  
			int n = 0; 
			int result = 10/n;
			System.out.println("결과: "+result);
			
			//NullPointerException 발생 가능성  
			String s = null;
			System.out.println(s.length());
			
		}catch(ArithmeticException e) { // 예외 발생 ArithmeticException e -> 정확한 예외클래스 사용을 권장함  
			//예외처리 코드  
			System.out.println("0으로 나누어서 예외발생"+e.getMessage()); // e.getMessage() 예외가 발생한 정보 출력  
		}catch(NullPointerException e) {
			System.out.println("객체생성없이 메서드 호출해서 예외발생"+e.getMessage());
		}catch(Exception e) {
			System.out.println("포괄적인 예외처리용-예외발생"+e.getMessage());
		}finally {
			System.out.println("반드시 실행되는 문장");
		}
		
		try {
			int x = 10;
			System.out.println(x);
		}finally {
			System.out.println("catch 없이 finally  가능. 반드시 실행되는 문자임 ");
		}
		System.out.println("프로그램 정상종료");
	}

}
