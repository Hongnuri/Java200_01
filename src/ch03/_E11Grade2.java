package ch03;

import java.util.Scanner;

/*
[문제 03-11-75] 입력한 점수에 따라 수/우/미/양/가를 판정하는 프로그램을 작성하자.
단 , || 연산자를 이용하시오.

실행 결과
점수 : 68
미

점수 : 89
수

점수 : 102
잘못 된 점수 입니다.
*/

class _E11Grade2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("score : ");
		int x = scanner.nextInt();
		
		if(x<0 || x>100) {
			System.out.println("wrong");
		} else if (x <=60) {
			System.out.println("ga");
		} else if (x <=70) {
			System.out.println("yang");
		} else if (x <=80) {
			System.out.println("미");
		} else if(x<=90) {
			System.out.println("u");
		} else if(x<=100) {
			System.out.println("su");
		}
	}
}



























//class _E11Grade2 {
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("점수 : ");
//		int x = scanner.nextInt();
//		
//		if (x < 0 || x > 100) {
//			System.out.println("잘못 된 점수 입니다.");
//		} else {
//			if (x < 55) {
//				System.out.println("가");
//			} else if (x < 66) {
//				System.out.println("양");
//			} else if (x < 77) {
//				System.out.println("미");
//			} else if (x < 88) {
//				System.out.println("우");
//			} else {
//				System.out.println("수");
//			}
//		}
//	}
//}

























