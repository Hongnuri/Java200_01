package ch03;

import java.util.Scanner;

/*
[문제 03-15-82] 키보드에서 입력한 3개의 정수 중 , 최솟값을 구하는 프로그램을 작성하자.

실행 결과 :
정수 a : 3
정수 b : 1
정수 c : 2
최솟값은 1 입니다.
*/

public class _E15Min3 {

	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = scanner.nextInt();	
		
		System.out.print("정수 b : ");
		int b = scanner.nextInt();
		
		System.out.print("정수 c : ");
		int c = scanner.nextInt();
		
		int min =a;
		
		if(min>b) {
			min=b;
		} else if(min>c) {
			min=c;
		}
		System.out.println(min);
	}
}






















//public class _Min3 {
//
//	public static void main(String[] args)  {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("정수 a : ");
//		
//		int a = scanner.nextInt();
//		
//		System.out.print("정수 b : ");
//		
//		int b = scanner.nextInt();
//		
//		System.out.print("정수 c : ");
//		
//		int c = scanner.nextInt();
//		
//		int min = a;
//		// int min = a 로 초기화한다.
//
//		if (b < min) {
//		// 최솟값 보다 b 가 더 작다면 min 은 b 가 된다.
//
//			min = b;
//		} 
//		if (c < min) {
//		// min 은 b 인 상황에서 c 와 비교한다. 
//
//			min = c;
//		// 만약 c 가 min 보다 더 작다면 min 은 c 가 된다.
//		}
//			
//		System.out.println("최솟값은" + min + "입니다.");
//
//	}
//}