package exam13_AbstractClass;

public abstract class AbstractClass {
	//구성요소 4가지
		int num;
		public void a() {
			System.out.println("a 메서드");
		}
		public AbstractClass() {}
		
		//추상메서드
		public abstract void b();
		public abstract void c();

}
