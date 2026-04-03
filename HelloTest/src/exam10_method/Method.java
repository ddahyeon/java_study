package exam10_method;

public class Method {
	//1. 파라미터 없고 리턴값 없는 경우 
	public void method() {
		System.out.println("method");
	}
		  
	//2. 파라미터 있고 리턴값 없는 경우  
	public void method2(int n, String s) {
		System.out.println("method2: "+n+ "," +s);
	}
	
	//3. 파라미터 없고 리턴값 있는 경우
	public int method3() {
		System.out.println("method3");
		return 100;
	}
	
	//4. 파라미터 있고 리턴값 있는 경우 
	public int method4(int n, int n2) {
		System.out.println("method4: "+n +","+n2);
		return n+n2;
	}
	//하나의 메서드로 오버로딩 가능 
	public void a (){}
    public void a (int n){}
    public void a (String s){}
    public void a (int n, String s){}
    public void a (String s, int n){}
}
