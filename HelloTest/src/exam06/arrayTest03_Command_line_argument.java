package exam06;

public class arrayTest03_Command_line_argument {

	public static void main(String[] args) {
		for(String s:args) {
			System.out.println(s);
		}
		System.out.println("end");
	//우클릭해서 run as -> run configutarion -> argument에서 값을 넣으면 main(string[] args) 여기에 값이 들어
	}

}
