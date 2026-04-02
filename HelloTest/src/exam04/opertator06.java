package exam04;

public class opertator06 {

	public static void main(String[] args) {
		// 증감 연사자 - 전치 연산자	
		/*
		int n=10;
		++n;
		System.out.println(n);
		
		--n;
		System.out.println(n);
		 */
			
		// 후치 연산자
		/*
		int n=10;
		n++;
		System.out.println(n);
		
		n--;
		System.out.println(n);
		*/
		
		//증감연산자와 다른 연산자 함께 사용 
		//전치     
	
		int n = 10;
		int result = ++n;
		System.out.println(result+"\t" +n);
		
		//후치
		
		int n2 = 10;
		int result2 = n2++; // 먼저 할당하고 나중에 증가 
		System.out.println(result2+"\t" +n);
		
		
		
		
	}

}
