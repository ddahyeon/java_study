package exam06;

public class arrayTest01_4 {

	public static void main(String[] args) {
		//new + 리터럴
		int [] num;
		num = new int[] {1,2,3};
		
		String [] name = new String[]{"홍길동","이순신"};
		
		
		for(int n:num) {
			System.out.println(n);
		}
		
		for(String n2:name){
			System.out.println(n2);
		}
	}

}
