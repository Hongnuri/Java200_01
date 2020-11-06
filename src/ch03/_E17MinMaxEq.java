package ch03;

import java.util.Scanner;

/*
[문제 03-17-87] 키보드에서 입력한 2개의 정숫값 중 , 작은 값과 큰 값을 표시하는 프로그램을 작성하자. 
두 정숫값이 같으면 "두 값이 같습니다." 라고 표시한다.
단 , min 과 max 를 선언하시오.

실행 결과 :
정수 a : 12
정수 b : 3
작은 값은 3 입니다.
큰 값은 12 입니다.

정수 a : 17
정수 b : 17
두 값이 같습니다.
*/

public class _E17MinMaxEq {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		
		int a = scanner.nextInt();
		
		System.out.print("정수 b : ");
		
		int b = scanner.nextInt();
		

		
	}
}

























//public class MinMaxEq {
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
//		if (a==b) {
//			System.out.println("두 값이 같습니다.");
//		} else { // a 와 b 가 다른 경우
//			int min , max; // min 과 max 선언
//			
//			if(a < b) {
//				min = a;
//				max = b;
//			} else {
//				min = b;
//				max = a;
//			}
//			System.out.println("작은 값은 " + min);
//			System.out.println("큰 값은 " + max);
//		}
//	}
//}

//public class MinMaxEq {
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
//		if (a > b) {
//			
//			System.out.println("작은 값은 " + b + " 입니다.");
//			System.out.println("큰 값은 " + a + " 입니다.");
//			
//		
//		} else if (a < b){
//			
//			System.out.println("큰 값은 " + b + " 입니다.");
//			System.out.println("작은 값은 " + a + " 입니다.");
//			
//		} else {
//			
//			System.out.println("두 값이 같습니다.");
//			
//		}	
//	}
//}