package exam14_interface_interface2_abstractClass_After;

public class Bird extends Pet{

	public Bird() {}

	public Bird(String name, int age) {
		super(name, age);
	}

	//
	@Override
	public void eat() {}
	@Override
	public void sleep() {}

}
