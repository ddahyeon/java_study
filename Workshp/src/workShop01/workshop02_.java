package workShop01;
import java.util.Scanner;

public class workshop02_ {

	public static void main(String[] args) {
		//문제1
		/*
		String s1 = "1";
		String s2 = "2";
		boolean bnx = false;
		char c1 = 'A';  //65
		char c2 = 'B';  //66
		char c3 = '1';  //49
		char c4 = '2';  //50
		int inx = 2;
		System.out.println(s1+s2);
		System.out.println(!bnx);
		System.out.println(c1+c2);
		System.out.println('1'+2);
		System.out.println(c3+c4);
		*/
		
		//문제2 100의 자리만 남기고 나머지는 0으로 바꾸는 프로그램 작성 
		/*
		int num = 456;
		int result =num/100*100;
		System.out.println(result);
		*/
		
		//문제3 문자 변수 ch가 영문자일때만 변수 b의 값이 true가 되도록 프로그램 작성
		/*
		char ch = 'z';
		boolean b = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'); // 아스키값 활용 a~z 	 
		System.out.println(b);
		*/
		
		//문제4 화씨를 섭씨로 변경하는 프로그램을 작성 하시오.  C(celcius): 섭씨, F(fahrenheit): 화씨
		//공식:  C = 5/9 * (F-32)
		/*
		int f = 100;
		float celcius = (5.0f/9)*(f-32); //5와 9가 둘 다 정수라서 소수값을 버렸음, 둘 중에 하나를 소수로 만들
		System.out.println("Fahrenheit:"+f);
		System.out.println("Celcius:"+celcius);
		*/
		
		//문제5 결과값 나타내기
		/*
		byte a = 10;
		byte b = 20;
		byte c = 30;
		char ch = 'A';
		ch = 'C';
		float f = 1.5f;
		long l = 2700000000L;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d >=0 ;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		*/
		
		//문제6 선언된 정수형 데이터가 홀수인지 짝수인지 출력한다. 단, 연산처리는 삼항 연산자를 이용한다.
		/*
		int i = 5;
		String result = (5%2==0)?"짝수":"홀수";
		System.out.println("선언 변수"+i+" 일때 결과:\n"+"숫자 "+i+"는 "+result+"입니다");
		*/
		
		//문제7  Scanner 클래스를 사용하여 키보드로 값을 입력 받아서 실행 결과와 같이 출력하시오.
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 이름을 입력하세요.");
		String name = scan.next();
		System.out.println("2. 나이를 입력하세요");
		int age = scan.nextInt();
		
		System.out.printf("이름은 %s 나이는 %d 입니다,name,age);
		*/
		
		//문제 8  Scanner 클래스를 사용하여 키보드로 두 개의 정수값을 입력 받아서 더하는 코드 작업
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("정수1을 입력하세요");
		int num = scan.nextInt();
		System.out.println("정수2를 입력하세요");
		int num2 = scan.nextInt();
		
		int sum=num+num2;
		System.out.printf("정수 %d 와 정수 %d의 합계: %d",num,num2,sum);
		*/
		
		//문제 9 Scanner 클래스를 사용하여 키보드로 두 개의 정수값을 입력 받아서 최대값을 구하는 코드 작업. 단, 3항 연산자만 사용할 것
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("정수1을 입력하세요");
		int num = scan.nextInt();
		System.out.println("정수2를 입력하세요");
		int num2 = scan.nextInt();
		
		int max = (num>num2)?num:num2;
		System.out.println(max);
		*/
		
		//문제10  Scanner 클래스를 사용하여 키보드로 주소값을 입력 받아서 도/시/구 이름을 출력하는 코드
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("주소를 입력하시오.");
		String address = scan.nextLine(); // 한 줄 입력

        String[] arr = address.split(" "); // 공백 기준 분리

        System.out.println("도명: " + arr[0]);
        System.out.println("시명: " + arr[1]);
        System.out.println("구명: " + arr[2]);
		*/
		
		//문제 11 Scanner 클래스를 사용하여 키보드로 세 개의 정수값을 입력 받아서 최대값을 구하는 코드 작업. 단, 한 번의 3항 연산자만 사용할 것
		Scanner scan = new Scanner(System.in);
		System.out.println("정수1을 입력하세요");
		int num = scan.nextInt();
		System.out.println("정수2를 입력하세요");
		int num2 = scan.nextInt();
		System.out.println("정수3를 입력하세요");
		int num3 = scan.nextInt();
		
		int max = (num>num2)?(num>num3?num:num2):num3;
	
		System.out.printf("정수 %d 와 정수 %d와 정수 %d 중에서 최대값: %d",num,num2,num3,max);
		
	}

}
