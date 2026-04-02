package exam06;

public class arrayTest01_5 {

	public static void main(String[] args) {
		//실습1: 제공된 배열의 총합을 구하시오
		int [] num = {1,2,3,4,5};
		int sum=0;
		for(int n:num) {
			sum+=n;
		}
		System.out.println(sum);
		
		
		
		
		//실습2: 제공된 이름중에서 글자수가 2글자인 인원수 출력하시오
		//문자열 길이: s.length
		String [] name = {"홍길동","세조","정조","단종","박혁거세"};
		int count=0;
		String megs="";
		for(String n2:name) {
			if (n2.length() == 2) {
				count++;
				megs = megs+n2;
			}
		}
		System.out.println(count);
		System.out.println(megs);
				
		
	}

}
