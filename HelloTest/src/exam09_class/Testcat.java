package exam09_class;

public class Testcat {

	public static void main(String[] args) {
		// cat 클래스를 메모리에 올림 (객체 생성)
		// 클래스명 변수명 = new 클래스명();
		Cat c1 = new Cat();
		Dog d1 = new Dog(); // Cat d1 = new Cat(); 이렇게 해도 된다는 말, new를 할때마다 인스턴스 변수가 새롭게 생성
		
		
		// 실제값 저장
		c1.name="야옹이";
		c1.age=2;
		c1.gender="암컷";
		
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.gender);
	
		//동작 호출
		c1.eat();
		c1.cry();
		
		//뭉치, 1, 수컷 생성하기 -> 나는 Dog 클래스를 따로 만들었지만 나중에는 그냥 인스턴스 변수만 바꿔서 사용해도 
		d1.name="뭉치";
		d1.age=1;
		d1.gender="수컷";
		
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.gender);
		

	

	}

}
