package exam11_static;

class Test{
	int num = 10; //인스턴스 변수 
	static int size = 20; // static 변수  
	
	public void print_num() {  //일반 메서드  
		System.out.println(num);
		System.out.println(size); // static은 먼저 만들어지므로 인식 가능  
		System.out.println(this); // 가능 
	}
	public static void print_size() {  //static 메서드   
		System.out.println(num); // new 생성 시점보다 느리므로 인식 불가  
		//System.out.println(this); // 이것도 인식 불가 
		//System.out.println(size);
	}
	
	//생성자
	public Test() {}
	
}//end Test 

public class StaticTest {
	public static void main(String[] args) {
		
		//new 이전  
		System.out.println(Test.size);
		Test.print_size();
		
		//new 이후  
		Test t = new Test();
		t.print_num();

	}

}
