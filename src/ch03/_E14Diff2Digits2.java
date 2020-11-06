package ch03;

import java.util.Scanner;
/*
[문제 03-14-80] 두 정숫값의 차가 10 이하인 경우 "두 값의 차는 10 이하입니다." 라고 표시하고 ,
그렇지 않으면 "두 값의 차는 11 이상 입니다." 라고 표시하는 프로그램을 작성하자.
단 , diff 선언과 ? 를 사용하시오.

실행 결과 :
정수 a : 12
정수 b : 3
두 값의 차는 10 이하 입니다.

정수 a : 35
정수 b : 23
두 값의 차는 11 이상 입니다.
*/

public class _E14Diff2Digits2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 : a");
		
		int a = scanner.nextInt();
		
		System.out.println("정수 : b");
		
		int b = scanner.nextInt();
		
		
	}
}








//public class Diff2Digits2 {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("정수 : a");
//		
//		int a = scanner.nextInt();
//		
//		System.out.println("정수 : b");
//		
//		int b = scanner.nextInt();
//		
//		int diff = a >= b ? a-b : b-a;
//		// ? 연산자를 이용한 diff 초기화
//		
//		System.out.println("두 값의 차는" + (diff <=10 ? "10 이하" : "11 이상") + "입니다.");
//	                    /*  
//						출력문에 문장과 넣은 ? 연산자. 사실 "10 이하" : "11 이상" 은 생각나는데 diff <= 10 은 쉽게 떠오르지 않는다.
//						이 경우 ? 뒤에 "10 이하" 가 true 조건이니 앞에 diff <= 10 을 떠올리면 된다.
//						*/
//	}
//}