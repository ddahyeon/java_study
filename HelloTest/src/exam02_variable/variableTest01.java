package exam02_variable;

public class variableTest01 {

	public static void main(String[] args) {
		// 저장할 데이터-> 이름: 홍길동, 나이: 20, 주소: 서울, 키: 180.3, 몸무게: 67.4, 결혼여부 ??
		
		String name = "홍길동";   // 4byte 크기 영역 확보
		int age = 20;           // 4byte 크기 영역 확보
		String address = "서울"; // 4byte
		float height = 180.3F;   // 4byte
		double weight = 67.4;   // 8byte
		boolean isMarried= false;      // 1byte
		
		age = age + 1; // 변수값 변경 
		
		/*
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("키:"+height);
		System.out.println("몸무게:"+weight);
		System.out.println("결혼여부:"+ isMarried); */
		
		
		System.out.printf("이름:%s" , name);
		System.out.printf("나이:%d \n" , age);
		System.out.printf("키:%2f \n",height);
		System.out.printf("몸무게:%2f \n",weight);
		System.out.printf("결혼여부:%b \n", isMarried);
		

	}

}
