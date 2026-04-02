package exam06;

public class arratTest01_2 {

	public static void main(String[] args) {
		String names[];
		names = new String[2];
		
		names[0]="홍길동";
		names[1]="이순신";
	
		
		//향상된 for문 
		for(String n:names ){
			System.out.println(n);
			}

	}

}
