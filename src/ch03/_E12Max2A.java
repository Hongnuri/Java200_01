package ch03;

import java.util.Scanner;

/*
[문제 03-12-77] 2개의 실숫값 중 , 큰 값을 표시하는 프로그램을 작성하자.
단 , max 를 선언하시오.

실행 결과
실수 a : 25.7
실수 b : 15.3
큰 쪽의 값은 25.7 입니다. 
*/

class _E12Max2A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("a:");
		double a = scanner.nextDouble();
		System.out.println("b");
		double b = scanner.nextDouble();
		
		
	}
}

































//public class _E12Max2A {
//
//public static void main(String[] args) {
//	
//	Scanner scanner = new Scanner(System.in);
//	
//	System.out.println("실수 a : ");
//	
//	double a = scanner.nextDouble();
//	
//	System.out.println("실수 b : ");
//	
//	double b = scanner.nextDouble();
//	
//	double max;
//	// double형 중 , 가장 큰 값을 저장한다.
//	if (a > b) {
//		max = a;
//	} else {
//		max = b;
//	}
//	System.out.println("큰 쪽의 값은 " + max + "입니다.");
//}
//}



//class _E12Max2A {
//	
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("실수 a : ");
//		double a = scanner.nextDouble();
//		
//		System.out.print("실수 b : ");
//		double b = scanner.nextDouble();
//		
//		if(a-b>0) {
//			System.out.println("큰 쪽의 값은 " + a + "입니다.");
//		} else {
//			System.out.println("큰 쪽의 값은 " + b + "입니다.");
//		}
//	}
//}