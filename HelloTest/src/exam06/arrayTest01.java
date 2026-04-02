package exam06;

public class arrayTest01 {

	public static void main(String[] args) {
		int num[];
		num = new int[3];
		
		num[0]=1;
		num[1]=2;
		num[2]=3;
		
		//향상된 for문 
		for(int n:num ){
			System.out.println(n);
			}
		
	}

}
