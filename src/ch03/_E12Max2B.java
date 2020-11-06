package ch03;

import java.util.Scanner;
/*
[문제 03-12-77] 2개의 실숫값 중 , 큰 값을 표시하는 프로그램을 작성하자.
단 , ? 연산자를 이용하시오.

실행 결과 
실수 a : 25.7
실수 b : 15.3
큰 쪽의 값은 25.7 입니다. 
*/

class _E12Max2B {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("a:");
		double a = scanner.nextDouble();
		System.out.print("b:");
		double b = scanner.nextDouble();
		
		
	}
}
















































//public class E12Max2B {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("실수 a : ");
//		
//		double a = scanner.nextDouble();
//		
//		System.out.println("실수 b : ");
//		
//		double b = scanner.nextDouble();
//		
//		double max = a > b ? a : b;
//		
//		System.out.println("큰 쪽의 값은 " + max + "입니다.");
//	}
//}


//class E12Max2B {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("실수 a : ");
//		double a = scanner.nextDouble();
//		System.out.print("실수 b : ");
//		double b = scanner.nextDouble();
//		
//		double max = a-b;
//		System.out.println("큰 쪽의 값은 " + (max > 0 ? a : b) + "입니다.");
//	}
//}
