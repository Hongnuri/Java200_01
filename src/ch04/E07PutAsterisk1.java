package ch04;

import java.util.Scanner;

/*
[문제 04-07-118] 입력한 값의 개수 만큼 '*' 를 표시하는 프로그램을 작성하자.
마지막에는 줄 바꿈 문자를 출력할 것.
단 , 읽은 값이 1미만이면 줄 바꿈 문자를 표시해서는 안 된다.

실행결과

몇 개의 * 를 표시할까요 ? : 12
************
*/


public class E07PutAsterisk1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("몇 개의 * 를 표시할까요 ? : ");
		
		int x = scanner.nextInt();
		
		if(x>0) {
			int y = 0;
			
		 while(y<x) {
			System.out.print('*');
			y++;
		}
		System.out.println();
		}
	}
}

//public class _E07PutAsterisk1 {
//	
//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);	
//	
//		System.out.println("몇 개의 * 를 표시할까요 ? : ");
//		
//		int x = scanner.nextInt();
//		
//		if(x>0) {
//			int y = 0;
//			
//			while(y<x) {
//				System.out.print('*');
//				y++;
//			}
//			System.out.println();
//		}
//	}
//}	