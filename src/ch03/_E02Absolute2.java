package ch03;

import java.util.Scanner;

/*
[문제 3-2-60] 정숫값을 읽어서 절댓값을 구하는 프로그램을 작성하자.
단 , 변수 abs 를 선언하시오.

실행 결과
정숫값:-35
절댓값은 35입니다.
*/

public class _E02Absolute2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정숫값:");
		
		int x = scanner.nextInt();
		
		int abs;
		
		if(x>0) {
			abs=x;
		} else {
			abs=-x;
		}
		System.out.println("int : " + abs);
	}	
}


























//public class E02Absolute2 {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("정숫값:");
//		
//		int x = scanner.nextInt();
//		
//		int abs;
//		
//		if (x>=0) {
//			abs = x;			
//		} else {
//			abs = -x;
//		}
//		System.out.println("절댓값은 " + abs + "입니다.");
//	}
//}