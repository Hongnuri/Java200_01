package ch03;

import java.util.Scanner;

/*
[문제 03-07-69] 2개의 변수 a,b 값을 읽어서 a,b 의 대소 관계를 다음과 같이 표시하는 프로그램을 작성하자.
"a가 크다." , "b가 크다." , "a와 b가 같다."
단 , diff 를 이용하시오.
읽은 정숫값의 대소 관계를 표시 (틀린 버전)

실행 결과 :
변수 a : 2147483647
변수 b : -1
b가 크다.

변수 a : -2147483648
변수 b : 1
a가 크다.
*/

























//public class _BalanceWrong {
//
//	public static void main(String[] args) {
//	
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("변수 a :");
//		
//		int a = scanner.nextInt();
//		
//		System.out.println("변수 b :");
//		
//		int b = scanner.nextInt();
//		
//		int diff = a-b;

//		/*
//		diff는 단순히 변수이다. a-b 라는 값을 diff 로 선언하고 , 초기화했다.
//		diff 를 이용한 대소 관계 표시는 두 수의 차이값을 적지 않아도 될 때 , 유용하다.
//		*/
//
//		if (diff > 0) {
//			
//			System.out.println("a가 크다.");
//			
//		} else if (diff < 0) {
//			
//			System.out.println("b가 크다.");
//			
//		} else {
//			
//			System.out.println("a와 b가 같다.");
//			
//		}
//	}
//}