package exam17_Utility;

public class EunmTest {

	public static void main(String[] args) {
		//switch 문 사용 예시 
		Day day = Day.SUNDAY;
		switch(day) {
		case SUNDAY:System.out.println("일요일");break;
		case MONDAY:System.out.println("월요일");break;
		case SATURDAY:System.out.println("토요일");break;
		
		default:System.out.println("dafault");break;
		}

	}

}
