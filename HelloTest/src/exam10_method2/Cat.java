package exam10_method2;

public class Cat {
	//은닉화(캡슐화)-> 외부접근 차단   
	private String name;
	private int age;
	private String gender;
	
	//기본 생성자 생성 
	public Cat() {
		
	}
	
	//파라미터 들어있는 생성자 생성   
	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//메서드  
	//name에 관리하는 setter 와 getter (파라미터 없고 리턴 있음) 메서드 추가 가능 
	//setter: set+변수명 으로 이름 만듦 두번째 단어 첫글자 대문자 : 카멜표기법   파라미터 ㅇ , 리턴 x
	public void setName(String name) { //수정 
		this.name=name;
	}
	public void setAge(int age) { 
		this.age=age;
	}
	public void setGender(String gender) { 
		this.gender=gender;
	}
	
	//getter: 카멜 표기법 권장 파라미터 x, 리턴 ㅇ 
	public String getName() { // 받아오기  
		return name; //this.name;
	}
	public int getAge() { 
		return age; 
	}
	public String getGender() { 
		return gender; 
	}

}
