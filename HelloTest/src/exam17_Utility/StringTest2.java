package exam17_Utility;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {
		//String 클래스의 메서드 정리
		String s = "hElLO";
		
		//1. 믄지열 길이 
		int n= s.length();
		System.out.println("1. 문자열 길이: "+n);
		
		char c = s.charAt(0);
		System.out.println("2. 특정위치의 문자얻기: "+c);
		
		System.out.println("3. 부분열: "+s.substring(1)); //1부터 끝까
		System.out.println("3. 부분열: "+s.substring(1,4)); //1-3번째까지 

		System.out.println("4. 대문자로 변환 : "+s.toUpperCase());  
		System.out.println("5. 소문자로 변환 : "+s.toLowerCase());
		
		
		String s2 = "     world     "; //앞 공백 5칸, 뒤 공백 5칸 
		System.out.println("6. 양쪽 공백제거 : "+s2.strip());
		System.out.println("6. 왼쪽 공백제거 : "+s2.stripLeading());
		System.out.println("6. 오른쪽  공백제거 : "+s2.stripTrailing());
		
		System.out.println("7. 문자열 연결 : "+(s+" world")); //+연산자 사용해서 연결하기 
		System.out.println("7. 문자열 연결 : "+s.concat("world")); //메서드로 연결하기 
		
		String s3 = "helLo";
		System.out.println("8. 문자열 포함여부  : " + s3.contains("he")); // s3 문자열에 해당하는 문자열이 포함됐는지 여부 true/false
		System.out.println("8. 문자열 포함여부  : " + s3.contains("ex"));
		
		System.out.println("9. 문자열 치환 : " + s3.replace('h','H'));
		System.out.println("9. 문자열 치환 : " + s3.replace("Lo","XY"));
		
		System.out.println("10. 특정문자의 위치 : " + s3.indexOf('e')); // 일치하는 문자가 없는 경우 -1 출력 
		
		String x = "hello";
		String x2 = new String("hello");
		String x3 = "Hello"; 
		
		//x와 x2가 같은 문자열인지??
		System.out.println("11. 문자열 비교: " +(x==x2)); //false, ==는 주소값을 비교하기 때문에 false가 나옴 
		System.out.println("11. 문자열 비교: " + x.equals(x2)); // true, 문자열을 비교하므로 같음 
		System.out.println("11. 문자열 비교: " + x.equals(x3));  // 대소문자를 비교하기 때문에 false 출력 
		System.out.println("11. 문자열 비교(대소문자 무시): " + x.equalsIgnoreCase(x3));
		
		//특정 구분자로 분리
		String ss = "홍길동/이순신/유관순";
		String[]  names = ss.split("/"); // "/"를 기분으로 떼어내서 배열에 저장 
		System.out.println("12. 구분자로 분리: " + Arrays.toString(names));
		
		//비문자열 ---> 문자열로 변환  
		// ex. 10-->"10", 3.15 --> "3.15", true --> "true"  
		System.out.println("13. 비문자열--->문자열: " + String.valueOf(10));
		System.out.println("13. 비문자열--->문자열: " + String.valueOf(3.14));
		System.out.println("13. 비문자열--->문자열: " + String.valueOf(true));
		System.out.println("13. 비문자열--->문자열: " + String.valueOf(new char[] {'A','B'}));

		
	}

}
