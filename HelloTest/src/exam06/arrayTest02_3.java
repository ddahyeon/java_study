package exam06;

public class arrayTest02_3 {

	public static void main(String[] args) {
		int [][] num = { {1,2}, {3,4}}; 
		
		System.out.println(num[0][0]);
		System.out.println(num[0][1]);
		System.out.println(num[1][0]);
		System.out.println(num[1][1]);
		
		for(int i=0; i<num.length; i++){ //행 반복
			  for(int j=0; j<num[i].length; j++){ //열 반복
				System.out.println(num[i][j]);
			  }
			}
		System.out.println("------------------------");
		for(int [] n:num){ // 헹반복
			  for(int n2:n){ //열반복
				System.out.println(n2);
			  }
		}
		
		//비정방형 리터럴 방식
		System.out.println("비전방형 리터럴 방식 ");
		
		int [][] num2 = { {1},{1,2},{1,2,3}};
		
		for(int [] n:num2){ // 헹반복
			  for(int n2:n){ //열반복
				System.out.println(n2);
			  }
		}
		

	}

}
