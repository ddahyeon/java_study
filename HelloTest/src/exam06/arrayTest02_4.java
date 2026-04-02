package exam06;

public class arrayTest02_4 {

	public static void main(String[] args) {
		int [][] num=new int[][] {{1,2},{3,4}};
		
		for(int i=0; i<num.length; i++){ //행 반복
			  for(int j=0; j<num[i].length; j++){ //열 반복
				System.out.println(num[i][j]);
			  }
			}
	
	}

}
