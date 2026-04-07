package exam12_inheritance6_polymorphims2_dynamicTyping;

public class TestEmployee2 {

	public static void main(String[] args) {
		
		 Employee [] e = { new engineer(),
		           new manager(),
		           new engineer(),
		           new engineer(),
		           new manager()};

//Engineer 만 추출해서 c() 호출하자.
for( Employee emp : e) {
	 if( emp instanceof engineer) {
		// emp.c();
		 
		 engineer eng = (engineer)emp;
		 eng.c();
		 
		 //한꺼번에
		 ((engineer)emp).c();
	 		}
	 
		}
	}
}

