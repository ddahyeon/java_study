package exam12_inheritance6_polymorphims2_dynamicTyping;

public class TestEmployee3 {

	//다형성 적용
		public static void method(Employee e) {
			// Manager만 출력하시오
			if ( e instanceof manager) {
				manager m = (manager)e;
				m.b();
				//((Manager) e).b();
			}
		}
		
		public static void main(String[] args) {

		    method(new manager());
		    method(new engineer());
		    method(new engineer());
		    method(new manager());
		    method(new manager());
			 
		}

}
