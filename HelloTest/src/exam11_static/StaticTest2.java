package exam11_static;

class Count{
	int num; //Count 횟수를 저장할 변수  
	static int count; // 누적할때 사용함 
	public Count() {
		num++;
		count++;
	}
}	

public class StaticTest2 {
	public static void main(String[] args) {
		System.out.println(Count.count); 
		//Count를객체생성 시 생성횟수를 카운트하기 
		Count c = new Count();
		System.out.println(Count.count);  //1
		Count c2 = new Count();
		System.out.println(Count.count);  //2 
		

	}

}
