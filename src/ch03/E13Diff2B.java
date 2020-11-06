package ch03;

import java.util.Scanner;
/*
[문제 03-13-79] 2개의 정숫값을 읽어서 두 값의 차를 표시하는 프로그램을 작성하자.
단 , ? 연산자를 이용하시오.

실행 결과 :
정수 a : 12
정수 b : 3
두 값의 차는 9 입니다.

정수 a : 3
정수 b : 12
두 값의 차는 9 입니다.
*/


public class E13Diff2B {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		
		int a = scanner.nextInt();
		
		System.out.print("정수 b : ");
		
		int b = scanner.nextInt();
		
		
	}
}
















//public class _Diff2B {
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
//		System.out.println("두 값의 차는 " + (a >= b ? a - b : b - a) + "입니다.");
//		
//	}
//}