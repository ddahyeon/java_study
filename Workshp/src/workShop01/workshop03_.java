package workShop01;
import java.util.Scanner;

public class workshop03_ {

	public static void main(String[] args) {
		//문제1 조건식  
		/*
		int inx = 15;
		// 1. int형 변수 inx가 10보다 크고 20보다 작을 때 true인 조건식
		if((inx>10)&&(inx<20)){
		System.out.println("true");
		}
		char ch1 =' ';
		// 2. char형 변수 ch가 공백이나, 탭이 아닐 때 true인 조건식
		if((ch1==' ')||(ch1 != '\t') ){
		System.out.println("true");
		}
		char ch2 = 'x';
		// 3. char형 변수 ch가 ‘x’ 또는 ‘X’일 때 true인 조건식
		if((ch2=='x')||(ch2=='X')){
		System.out.println("true");
		}
		char ch3 = '0';
		// 4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
		if((ch3>=0)&&(ch3<=9)){
		System.out.println("true");
		}
		char ch4 = 'a';
		// 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		if((ch4>='a')&&(ch4<='z')||(ch4>='A')&&(ch4<='Z')){
		System.out.println("true");
		}
		int year = 400;
		// 6. int형 변수 year가 400으로 나눠 떨어지거나, 또는 4로 나눠 떨어지고 100으로 나눠 떨어지지 않을 때 true인 조건식
		if((year%400==0)||((year%4==0)&&(ch4%100!=0))){
		System.out.println("true");
		}
		boolean powerOn =false;
		// 7. boolean형 변수 powerOn가 false일 때 true인 조건식
		if(!powerOn){
		System.out.println("true");
		}
	}
	*/
		
		//문제2 1부터 20까지의 정수 중에서 2의 배수가 아니고 3의 배수가 아닌 수의 총합을 구하시오.
		/*int sum=0;
		for(int i=0; i<=20; i++) {
			if(i%2!=0 && i%3!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		*/
		
		//문제3. for문을 while 문으로 변경 
		
		/*
		int i = 0; 
		while (i<=10) {
			int j = 0; 
			while (j<=i) {
			System.out.print("*");
			j++;
			}
			System.out.println();
			i++;
		}
		
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println();
			}
		*/
		
		
		//문제4. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
		/*
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.printf("%d+%d=%d\n",i,j,i+j);
				}
			}
		}
		
		*/
		
		//문제5. Scanner 이용하여 임의의 정수값을 입력받고, 입력 받은 정수값만큼 1부터 반복한다. 이때 짝수값의 총합과 평균값을 출력하시오.
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num=scan.nextInt();
		int count =0;
		int sum=0;
		for (int i=1; i<=num; i++) {
			if(i%2==0) {
				count+=1;
				sum+=i;
			}
		}System.out.printf("총합:%d\n평균값:%d", sum, sum/count);
		*/
		
		//문제6. 세 개의 주사위를 던졌을 때, 눈의 곱이 3의 배수인 값을 출력하는 프로그램을 작성하시오
		/*
		int total=0;
		for (int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				for(int x=1; x<=6; x++) {
					if((i*j*x)%3 == 0) {
						total = i*j*x;
						System.out.printf("%d * %d * %d = %d\n", i,j,x,total);
					}
				}
			}
		}
		*/
		
		//문제7. 1부터 100까지 더하는 프로그램을 작성 한다. 단, Scanner로 1자리 정수형 데이터를 입력 받아 입력 받은 수의 배수만 더한다.
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("한자리 정수값을 입력하시오");
		int num = scan.nextInt();
		int sum = 0;
		String result = "";
		
		for(int i=num; i<=100; i++) {
			if(i%num==0) {
				sum+=i;
			}
			// 마지막 숫자인지 체크
	        if(i + num > 100) {
	            result += i;
	        } else {
	            result += i + "+";
	        }
		}	System.out.println(result + "\n" + " = " + sum); 
		*/
		
		//문제8. 1부터 100까지 반복하면서 3의 배수는 foo, 5의 배수는 bar , 7의 배수는 baz 값을 출력하는 프로그램을 작성하시오
		/*
		 for(int i = 1; i <= 100; i++) {
		 
		    System.out.print(i);

		    if(i % 3 == 0) {
		        System.out.print(" foo");
		    }
		    if(i % 5 == 0) {
		        System.out.print(" bar");
		    }
		    if(i % 7 == 0) {
		        System.out.print(" baz");
		    }

		    System.out.println(); // 줄바꿈
		}
		*/
		
		//문제9. Scanner 클래스를 사용하여 키보드로 세 개의 정수값을 입력 받아서 최대값과 최소값을 구하는 코드 작업. 단, if 문 사용할 것
		
		
	}
}

