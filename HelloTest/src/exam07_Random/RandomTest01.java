package exam07_Random;
import java.util.Random;

public class RandomTest01 {

	public static void main(String[] args) {
		Random r = new Random();
		
		//r.setSeed(1234); //seed 고정 -> 항상 고정해둔 값을 리턴
		int n = r.nextInt();
		float f = r.nextFloat();
		boolean b = r.nextBoolean();
		
		int n2=r.nextInt(3);
		
		System.out.println(n);
		System.out.println(f);
		System.out.println(b);
		System.out.println(n2);
		
		

	}

}
