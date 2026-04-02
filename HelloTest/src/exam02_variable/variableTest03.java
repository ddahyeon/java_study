package exam02_variable;

public class variableTest03 {
	int size=20; // 인스턴스변수
	

	public static void main(String[] args) {
		// 로컬변수
		int num=10;
		System.out.println(num);
		
		//인스턴스 변수	
		//system.out.println(size); 객체생성전이기 때문에 사용불가
		variableTest03 t=new variableTest03();
			System.out.println(t.size); //객체생성후이기 때문에 사용가능 
		

	}

}
