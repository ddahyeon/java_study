package exam09_class3_this;


//핸들링 클래스  
public class Testcat {

	public static void main(String[] args) {
Cat c1 = new Cat("야옹이",200, "암컷"); //생성자를 호출하는 코드 -> 생성자가 없어도 이 코드로 인해서 생성자를 제공해줌 
		
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.gender);

	}

}
