package exam10_method2;

public class TestCat {

	public static void main(String[] args) {
		// 키티, 2살, 암컷 객체생성하기
		Cat c = new Cat("키티", 2, "암컷");
		
		//c.name="다니엘";  접근불가함 -> 캡슐화 해놔서 -> 매서드를 활용해 인스턴스 변수 수정, 조회 등의 작업 
		c.setName("다니엘"); // 수정 가능 
		c.setAge(4);
		c.setGender("수컷");
		String name=c.getName();
		int age=c.getAge();
		String gender=c.getGender();
		System.out.println(name+age+gender);

	}

}
