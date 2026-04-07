package exam14_interface_interface3_before;

public class Bird extends Pet implements Flyer{

	public Bird() {}

	public Bird(String name, int age) {
		super(name, age);
	}

	//
	@Override
	public void eat() {}
	@Override
	public void sleep() {}
	
	public void fly() {}
}