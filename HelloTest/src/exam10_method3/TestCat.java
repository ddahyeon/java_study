package exam10_method3;

public class TestCat {

	public static void main(String[] args) {
		// 키티, 2살, 암컷 객체생성하기
		Cat c = new Cat("키티", 2, "암컷");
		
		c.setAge(30);
		
		String name=c.getName(); // 조회 역
		int age=c.getAge();
		String gender=c.getGender();
		System.out.println("이름:" + name+ "\n" + "나이: "+age+"\n"+"성별: " +gender);

	}

}
