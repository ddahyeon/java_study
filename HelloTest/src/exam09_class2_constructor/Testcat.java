package exam09_class2_constructor;


public class Testcat {

	public static void main(String[] args) {
		Cat c1 = new Cat("야옹이",200, "암컷"); //생성자를 호출하는 코드 -> 생성자가 없어도 이 코드로 인해서 생성자를 제공해줌 
		
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.gender);
		
		/*
		c1.name="야옹이";
		c1.age=200;  // 문법적으로 문제없음, 논리적으로 문제가 있기떄문에 cat에서 private 변수 만들었음 그러면 여기서 접근을 못함   
		c1.gender="암컷";
		*/
		
		

	}

}
