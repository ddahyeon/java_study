package exam10_method3;

public class Cat {
	
	private String name;
	private int age;
	private String gender;
	
	public Cat() { }// 기본생성자  
	
	

	public Cat(String name, int age, String gender) {  //파라미터 생성자 
		this.name = name;
		//this.age = age;
		//age 검증  
		if(ageValidCheck(age)) {
			System.out.println("나이 입력 오류");
		}else {
			this.age=age;
		}
		this.gender = gender;
	}
	
	//우클릭 -> source -> getter and setter 하면 자동으로 생성 가능 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) { // 나이검증
		if(ageValidCheck(age)) {  //if 문 중복 안되도록 체크 메서드를 만들어줌 
			System.out.println("나이 입력 오류");
		}else {
			this.age=age;
		}
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// 필요시 메서드 추가
	// age 증하는 메서드 추가해보기 
	//age 검증  
	public boolean ageValidCheck(int age) {
		boolean result = true;
		//조건체크 
		if(age>=20) result=false; //20살 이상이면 false 
		return result;
	}
	
	
	
		
}
