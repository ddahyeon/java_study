package exam03_data;

public class castTest01 {

	public static void main(String[] args) {
		// 1. 수치형
		// byte > short > int > long > float > double 
		
		byte b=10;
		short b2=b; // byte 타입의 b가 short 타입으로 변경
		int b3=b2;
		long b4=b3;
		float f=b4;
		double f2=f; 
		
		char c = 'A'; //65
		int n=c;
		char c2 = 'a';
		int n2=c2; //97
		
		//System.out.println(n2);
		
		Short s = 10;
	    short s2 = 20;
	    //short s3 = s + s2; // 에러남, int로 형변환되어 나옴 
	    int s4 = s + s2; 
	    //System.out.println(s4); //30 출력됨  
	    
	    int k = 10;
	    double k2 = 20;
	    //int k3 = k+k2; // double이 더 크므로 큰 타입으로 결과 반
	    double k4 = k + k2; 
	    
	    
	    // 문자열 + (비)문자열 --> 문자열로 변환됨 
	    System.out.println("hello"+"world");
	    System.out.println("hello"+10);
	    System.out.println("hello"+3.14);
	    System.out.println("hello"+true);
	    
	    System.out.println("hello"+10+20+30);
	    System.out.println(10+20+30+"hello");
	    
	    
	}

}
