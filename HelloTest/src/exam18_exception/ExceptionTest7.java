package exam18_exception;

//계좌 
class Account{
	int balance=100; //잔고  
	
	//출금 
	public void withdraw(int amt) {
		if(balance >= amt) {
			balance -= amt;
		}else {
			//잔액부족일 경우  
			// 하지만 개발자는 에외라고 가정할 수 있기 때문에 명시적 예외발생 필요  
			throw new ArithmeticException("잔액부족으로 예외발생");
		}	
	}
}
	public class ExceptionTest7{
		public static void main(String[] args) {
			System.out.println("프로그램 시작");
			Account acct = new Account();
			acct.withdraw(500);
			System.out.println("프로그램 정상종료");
		}
	}
