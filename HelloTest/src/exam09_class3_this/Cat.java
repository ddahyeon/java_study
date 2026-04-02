package exam09_class3_this;

//재사용   클래스  
public class Cat {
	 	String name;
		int age; // private을 붙이면 외부에서 접근 불가     
		String gender;
		
		//해당 클래스에 들어가고 우클릭 -> 소스 -> generator superclass 하면 생성자 자동으로 만들어
		public Cat() {}
			
		//초기화하는 진짜 생성자 
		public Cat(String name, int age, String gender) {
				this.name=name;
				this.age=age;
				this.gender=gender; // 로컬변수가 많아서 이름이 동일할때 주소지를 참조하는 this를 붙여야함 
			}
		
		
		
		
		 

			 
		 
		 
		

}
