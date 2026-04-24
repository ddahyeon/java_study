package workShop;
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
		
		/*//문제9. Scanner 클래스를 사용하여 키보드로 세 개의 정수값을 입력 받아서 최대값과 최소값을 구하는 코드 작업. 단, if 문 사용할 것
		Scanner scan = new Scanner(System.in);
		System.out.println("세 정수의 최대값 구하기");
		System.out.print("a 값: ");
		int a = scan.nextInt();
		System.out.print("b 값: ");
		int b = scan.nextInt();
		System.out.print("c 값: ");
		int c = scan.nextInt();
		
		int max = a;
		if(b>max)max=b;
		if(c>max)max=c;
		
		System.out.println("최대값: " + max);
		*/
		
		//문제10. Scanner 클래스를 사용하여 키보드로 수값을 입력받아서 1부터 입력 받은 정수값까지의 총 합을 구해라 (단, 음수 및 0을 입력한 경우에는 다시 입력받음 ) 
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int sum=0;
		int a = scan.nextInt();
		do {
			  System.out.print("a 값: ");
			 a = scan.nextInt();
			}while(a<=0);
			
			for(int i=1; i<=a; i++) {
				sum += i;
			}
		  System.out.printf("1부터 %d 까지의 총합: %d" , a, sum);	*/
		
		//문제11. Scanner 클래스를 사용하여 키보드로 두개의 정수값을 입력받아서 a와  b변수에 저장하고 b-a값을 출력해라 (b값이 a값보다 작으면 b값을 다시 입력 )
		/* Scanner scan = new Scanner(System.in);
		System.out.println("a정수를 입력하시오");
		int a = scan.nextInt();
		int b=0;
		while (true) {
			System.out.print("b의 값：");
			b = scan.nextInt();
			if (b > a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}

		System.out.println("b - a는 " + (b - a) + "입니다.");   */
		
		//문제12.  Scanner 클래스를 사용하여 키보드로 양의 정수값을 입력받아 자릿수를 출력해라( 음수값 입력시 다시 입력) 
		/* Scanner scan = new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수 구하기");
		int n;
		do {
			System.out.print("정수값：");
			n = scan.nextInt();
		} while (n <= 0);
		int no = 0; 			// 자릿수
		while (n > 0) {
			n /= 10; 			// n을 10으로 나눔
			no++;
		}
		System.out.println("그 수는 " + no + "자리입니다.");   */
		
		
		//문제13. Scanner 클래스를 사용하여 키보드로 2자리의 양의 정수값을 입력받아 출력해라 (단, 2자리 양의 정수가 아니면 다시 입력) 
		/* Scanner scan = new Scanner(System.in);
		int no;

		System.out.println("2자리의 정수를 입력하세요.");

		do {
			System.out.print("입력：");
			no = scan.nextInt();
		} while (no < 10 || no > 99);  

		System.out.println("입력값은 " + no );    */
		
		//문제14. 반복문을 사용하여 곱셉표 출력  
		/* System.out.println("----- 곱셈표 -----");

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i * j);
			System.out.println();   
		}   */
				
		//문제15. Scanner 클래스를 사용하여 키보드로 정수값을 입력받아서 실행결과와 같이 *을 출력해라  
		/* Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

		do {
			System.out.print("몇 단 삼각형입니까? : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}   */
		
		
		//문제16. Scanner 클래스를 사용하여 키보드로 정수값만을 입력받아서 *을 출력 (역삼각형 모양으로 )
		/* Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("왼쪽 위가 직각인 역삼각형");

		do {
			System.out.print("몇 단 삼각형입니까? : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 					// 개행(줄변환)
		}    */ 
		
		
		//문제17. Scanner 클래스를 사용하여 키보드로 정수값만을 입력받아서 *을 출력 (역삼각형 모양으로 오른쪽 위가 직각인 모양)
		/* Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("오른쪽 위가 직각인 삼각형");

		do {
			System.out.print("몇 단 삼각형입니까? : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= i - 1; j++) 		// i-1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println();					// 개행(줄변환)
		}   */
		
		
		//문제18. Scanner 클래스를 사용하여 키보드로 정수값만을 입력받아서 *을 출력 (역삼각형 모양으로 오른쪽 아래가 직각인 모양 )
		/* Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("오른쪽 아래가 직각인 삼각형");

		do {
			System.out.print("몇 단 삼각형입니까? : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,ln)
			for (int j = 1; j <= n - i; j++) 		// n-i개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= i; j++) 			// i개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 					// 개행(줄변환)
		}    */
 
		//문제19. Scanner 클래스를 사용하여 키보드로 정수값만을 입력받아서 *을 출력 (완전한 삼각형 모양)
		/* Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("피라미드 모양 삼각형");

		do {
			System.out.print("몇 단 삼각형입니까? : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 						// 개행(줄변환)
		}    */
		
		
		//문제20. 근무시간과 월급을 입력받아 근무시간에 따라 보너스를 계산하여 출력하는 코드 
		/* int time = 0; //시간
		int pay = 0;  //봉급
		double bonus = 1; //시간에 따른 보너스 율
		
		Scanner scan = new Scanner( System.in );

		System.out.println( "보너스 + 월급 구하기" );
		
		System.out.printf( "근무시간입력 : " );
		time = scan.nextInt();					//근무시간
		
		System.out.printf( "월급입력 : " );
		pay = scan.nextInt();					//월급입력

		System.out.println( "====================" );

		//보너스 계산
		if( time >= 25 ) bonus = 1;
		else if( time >= 20 ) bonus = 0.8;
		else if( time >= 18 ) bonus = 0.5;
		else bonus = 0;
		System.out.println("보너스 : " + (int)( pay * bonus ) );

		//급여 계산
		System.out.println("지급될 급여 : " + (int)( pay * ( 1 + bonus ) ) ); */
		
		
		//문제21. for문을 사용하여 1~100까지 출력 (한줄에 10개씩 )
		/*
		for (int i = 1 ; i <= 100 ; i++ ){
			if( i < 10 ) System.out.print( " " );

			System.out.print( i + " " );

			if( i % 10 == 0 )
			{
				System.out.println();
			}
		}    */
		
		//문제22. for문을 활용한 실습 
		/* for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}   */
		
		
		
		//문제23. 임의의 수를 입력받아 1~ 세는 코드  
		Scanner scan=new Scanner(System.in);
		System.out.print("임의의수 입력: ");
		int num=scan.nextInt();
		int sum=0;
		int i=num;
		while (1<=i){
			 sum += i;
	            i--;
	        
		}
		System.out.println("입력하신 숫자의 총합:"+sum);
		
		
		
	}
}
		
	


