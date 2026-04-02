package exam02_variable;

public class variableTest04 {

	public static void main(String[] args) {
		// 변수명 중복불가
		int num=10;
		/*
		int size=20;
		int num=30; */
		
		//로컬변수는 사용전에 반드시 초기화	
		int size;
		// system.out.println(size);
		
		//블럭 scope: 블럭내에서 선언된 변수는 블럭 밖에서 사용 불가
		//블럭이 다르면 변수명 동일해도 
		{
			int age =20;
			System.out.prtinln(age);
		}
		
		//system.out.println(age);
	
	}

}
