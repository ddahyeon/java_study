package exam13_AbstractClass;

public class AbstractChildClass extends AbstractClass {
	@Override
	public void b() {
		System.out.println(num);
	}

	@Override
	public void c() {
		//a();
	}

}
