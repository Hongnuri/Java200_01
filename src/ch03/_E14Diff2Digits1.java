package ch03;

import java.util.Scanner;
/*
[문제 03-14-80] 두 정숫값의 차가 10 이하인 경우 "두 값의 차는 10 이하입니다." 라고 표시하고 ,
그렇지 않으면 "두 값의 차는 11 이상 입니다." 라고 표시하는 프로그램을 작성하자.
단 , diff 선언과 ? 를 이용하시오.

실행 결과 :
정수 a : 12
정수 b : 3
두 값의 차는 10 이하 입니다.

정수 a : 35
정수 b : 23
두 값의 차는 11 이상 입니다.
*/

class _E14DiffDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("a:");
		int a = scanner.nextInt();
		System.out.print("b:");
		int b = scanner.nextInt();
	
		int diff = b<a ? a-b : b-a;
		System.out.println(diff <= 10 ? "10": "11" );
		
		
	}	
}

































//public class Diff2Digits1 {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("정수 a : ");
//		
//		int a = scanner.nextInt();
//		
//		System.out.println("정수 b : ");
//		
//		int b = scanner.nextInt();
//		
//		int diff = a >= b ? a-b : b-a;
//		// a 가 b 보다 크거나 같을 때 , a-b 이다. 아니라면 b-a 이다.
//
//		if (diff <= 10) {
//			
//			System.out.println("두 값의 차는 10 이하 입니다.");
//			
//		} else {
//			
//			System.out.println("두 값의 차는 11 이상 입니다.");
//			
//		}	
//	}
//}	