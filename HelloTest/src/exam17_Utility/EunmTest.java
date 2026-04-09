package exam17_Utility;

import java.util.Arrays;

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
		//Day의 enum의 메서드  
		System.out.println("name: "+day.name());  // 상수값을 나타냄 
		System.out.println("ordinal: "+day.ordinal());  // 위치를 나타냄  
		Day[] days=day.values(); // 상수값들을 배열로 넣기  
		System.out.println(Arrays.toString(days)); // 배열 출력  arrays.toString  

	}

}
