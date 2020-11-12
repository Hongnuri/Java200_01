package ch04;

import java.util.Scanner;

/*
[문제 04-10-126] 양의 정숫값 n을 읽어서 1부터 n까지의 곱을 구하는 프로그램을 작성하자.

실행 결과  
양의 정숫값 : 5
1부터 5까지의 곱은 120 입니다. 
*/

public class E10Factorial {
	public static void main(String[] args) {
		
	
	}
}	






















//public class E10Factorial {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int n;
//		do {
//			System.out.println("양의 정숫값 : ");
//			n = scanner.nextInt();
//		} while(n<=0);
//		
//		int factorial = 1; // 곱해진 결과값을 저장하기 위한 변수 factorial 을 1로 초기화한다.
//		int i = 1; // n 의 공통 시작값을 변수 i로 선언하고 , 1로 초기화한다.
//		
//		while(i<=n) { // i가 n까지 입력되는 것을 반복한다.
//			
//			factorial *=i; // factorial 에 i 곱하기
//			i++; // i 증가
//		}
//		System.out.println("1부터 " + n + "까지의 곱은 " + factorial + "입니다.");
//	}
//}