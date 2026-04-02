package exam06;

public class arrayTest03_Command_line_argument_2 {

	public static void main(String[] args) {
		// 실행시 command line argument로 정수값을 입력받아서 입력받은 정수값만큼 반복해서 hello 출력하시오
		String s = args[0]; //문자열을 입력함 
		int num = Integer.parseInt(s); //문자열을 숫자로 변경해줌 
		
		for(int i=1; i<num; i++){
			System.out.println("hello:"+i);
		}
		System.out.println("end");
		
	}

}
