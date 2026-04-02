package exam09_class2_constructor;

public class Cat {
	
	 String name;
	int age; // private을 붙이면 외부에서 접근 불가     
	 String gender; 
	
	// 기본적으로 인스턴스 변수는 private로 줌 그래서 외부에서 직접접근이 어려움 
	 public Cat(String s) {
		 name =s;
	 }
	 public Cat(String s, int n ) {  // 생성자 
		name =s;
		age =n;
	}
	 public Cat(String s, int n,String s2 ) {
		 name = s;
		//age=n;
		if(n>=20) {
			System.out.println("나이값 오류, 확인하세요");
		}else {
			age=n;
			
		}
		gender=s2;
		
	} 
	

}
