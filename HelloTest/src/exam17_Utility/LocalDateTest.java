package exam17_Utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {

	public static void main(String[] args) {
		 // 날짜 얻기  26-4-9 
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		//과거 날짜 
		LocalDate today2 = today.minusDays(2); //2일 전 
		LocalDate today3 = today.minusDays(1); //하루 전  
		LocalDate today4 = today.minusDays(1);
		System.out.println(today2);
		System.out.println(today3);
		System.out.println(today4);
		
		
		//미래 날짜 
		LocalDate today5 = today.plusDays(3); //3일 후  
		LocalDate today6 = today.plusDays(3);
		LocalDate today7 = today.plusDays(3);
		System.out.println(today5);
		System.out.println(today6);
		System.out.println(today7);
		
		//특정 날짜 
		LocalDate my = LocalDate.of(2040,  10, 22);
		System.out.println(my);
		
		//str --> LocalDate 
		String str = "2026-12-25"; // "2026년 12월 25일", "2026/12/25"  
		// - 으로 구분되어있는 형태의 날짜 문자열을 진짜 날짜로 변환 
		
		LocalDate my2 = LocalDate.parse(str);
		System.out.println(my2);
		 
		//년월일로 표현되어있는 날짜를 인식가능하게 변환하여 추출  
		String str2 = "2026년12월25일";
		LocalDate my3 = LocalDate.parse(str2, DateTimeFormatter.ofPattern("yyyy년MM월dd일"));
		System.out.println(my3);
		
		//  /로 표현되어있는 날짜를 인식가능하게 변환하여 추출  
		String str3 = "2026/12/25";
		LocalDate my4 = LocalDate.parse(str3, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(my4);
		
		
		
	}

}
