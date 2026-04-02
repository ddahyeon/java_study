package exam09_class4_Student;

public class TestStudent {

	public static void main(String[] args) {
		// - 홍길동 20 서울
		// - 이순신 22 광주
		// - 유관순 24 (주소 아직 모르는 상태로 null)
		
		Student s1 = new Student("홍길동",20,"서울");
		Student s2 = new Student("이순신",22,"광주");
		Student s3 = new Student("유관순",24);
		
		System.out.printf("이름:%s, 나이:%d, 주소:%s \n", s1.name, s1.age, s1.address);
		System.out.printf("이름:%s, 나이:%d, 주소:%s \n", s2.name, s2.age, s2.address);
		System.out.printf("이름:%s, 나이:%d, 주소:%s \n", s3.name, s3.age, s3.address);

	}

}
