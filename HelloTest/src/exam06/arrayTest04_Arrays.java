package exam06;

import java.util.Arrays;

public class arrayTest04_Arrays {

	public static void main(String[] args) {
		// 1.배열을 문자열로 모두 출력
		int [] num = {10,20,30};
		String s = Arrays.toString(num); //[10,20,30]
		System.out.println(Arrays.toString(num));

		// 2.배열을 오름차순 정렬
		int [] num2 = {3,7,5,6,9};
		Arrays.sort(num2);  //오름차순 정렬 : Arrays.sort(배열);
		System.out.println(Arrays.toString(num2));
		
		//3. 배열을 특정값으로 채우기 
		String [] name = {"A","B","C"};
		Arrays.fill(name, "X");  // Arrays.fill(배열, 변경할 값);
		System.out.println(Arrays.toString(name));
		
		 // 4. 배열을 일부분을 특정값으로 채우기
		String [] name2 = {"A","B","C","D","E","F"};
		Arrays.fill(name2, 0,3,"X");  // Arrays.fill(배열, 시작위치, 끝위치, 변경할 값);
		System.out.println(Arrays.toString(name2));
		
		// 5. 배열에서 특정요소의 위치값(index) 찾기
		int [] num3 = {3,7,5,6,9};
		Arrays.sort(num3);  //정렬 필수 
		System.out.println(Arrays.toString(num3)); // 정렬된 데이터  
		int idx = Arrays.binarySearch(num3, 6); // 2 출력됨 , 위치값 찾
		System.out.println(idx);
		
		// 6. 배열비교
		// Arrays.equals(배열1, 배열2);
		int [] x = {1,2,3,4,5};
		int [] x2 = {1,2,3,4,6};
		boolean result = Arrays.equals(x,x2);  //동일하면 true, 다르면 false
		System.out.println(result);
		
		// 7. 배열크기 변경 (기존 배열크기변경은 불가, 새로운 배열을 만들어서 기존 배열값 복사함)
		int [] num4 = {3,7}; //2개뿐인걸 5개로 늘리고 싶을때 
		int [] nnum = Arrays.copyOf(num4, 5); //(원래배열명, 크기) 
		System.out.println(Arrays.toString(nnum)); // [3,7,0,0,0] 출력   
		
		// 8. 
		
		
	}

}
