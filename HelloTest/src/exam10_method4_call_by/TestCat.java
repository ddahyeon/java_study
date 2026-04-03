package exam10_method4_call_by;
//연습용 실제 프로젝트 할때는 java파일 따로 두개 만들어야함 
// Cat 클래스 
class Cat{
	String name;
	int age;
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
} // end Cat

	public class TestCat {
	//call by value: 인자값이 기본형 
	public static void pdt(int n) { //static은 객체생성 없이 메서드 호출 가능  
		n = 20;  
		
	}
	
	//call by value reference: 인자값이 참조형  
	public static void rdt(Cat c) {
		c.age = 20;
		
	}
	public static void main(String[] args) {
		
		//call by value reference 실습 -> 주소값이 넘어간 것이기 때문에 변경전과 후가 다르게 나옴 
		Cat c = new Cat("키티",2);
		System.out.println("변경전:"+c.age); //2
		rdt(c);
		System.out.println("변경후:"+c.age); //20
		
		//call by value 실습 
		int num = 10; 
		System.out.println("변경전:"+num); //10
		pdt(num);
		System.out.println("변경후:"+num); //10 복사되는 개념임  

	}

}
