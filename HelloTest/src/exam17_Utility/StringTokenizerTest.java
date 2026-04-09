package exam17_Utility;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String s = "홍길동 이순신 유관순";  // 공백을 기준으로 띄었음 
		StringTokenizer st = new StringTokenizer(s);
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		String s2 = "홍길동/이순신/유관순/강감찬";
		StringTokenizer st2 = new StringTokenizer(s2, "/");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		//구분자 여러개 지정 가능
		String s3 = "영조,홍길동/이순신/유관순:강감찬,정조";
		StringTokenizer st3 = new StringTokenizer(s3, "/,:"); //" "안에 구분자 한 번에 적으면 됨  
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
	}
}
