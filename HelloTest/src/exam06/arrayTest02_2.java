package exam06;

public class arrayTest02_2 {

	public static void main(String[] args) {
		//비정방형 배열 
		int [][] num;
		num = new int[3][]; 
		
		num[0] = new int[1];  // 0번행의 1개열
		num[1] = new int[2];  // 1번행의 2개열
		num[2] = new int[3];  // 2번행의 3개열
		
		num[0][0]=1;
		num[1][0]=2;
		num[1][1]=3;
		num[2][0]=4;
		num[2][1]=5;
		num[2][2]=6;
		
		for(int i=0; i<num.length; i++){ //행 반복
			  for(int j=0; j<num[i].length; j++){ //열 반복
				System.out.println(num[i][j]);
			  }
			}
		
		for(int [] n:num){ // 헹반복
			  for(int n2:n){ //열반복
				System.out.println(n2);
			  }
		}
		System.out.println("행의길이:"+num.length);
		System.out.println("1행의 열의길이:"+num[0].length);
		System.out.println("2행의 행의길이:"+num[1].length);
		System.out.println("3행의 열의길이:"+num[2].length);
		
		System.out.println(num[0][0]);
		System.out.println(num[1][0]);
		System.out.println(num[1][1]);
		System.out.println(num[2][0]);
		System.out.println(num[2][1]);
		System.out.println(num[2][2]);

	}

}
