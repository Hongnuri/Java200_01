package ch03;

import java.util.Scanner;

/*
[문제 03-05-66] 정숫값을 읽어 부호(양수/음수/0) 를 판정하는 프로그램을 작성하자.
실행 결과 :
정숫값:37
값이 양수 입니다.

정숫값: 0
값이 0 입니다.

정숫값: -35
값이 음수 입니다.
*/

class E05Sign {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정숫값 : ");
		
		int x = scanner.nextInt();
		
		if (x>0) {
			System.out.println("값이 양수 입니다.");
		} else if (x<0) {
			System.out.println("값이 음수 입니다.");
		} else {
			System.out.println("값이 0 입니다.");
		}
	}
}



























//public class E05Sign {
//	
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("정숫값:");
//		
//		int x = scanner.nextInt();
//		
//		if (x > 0) {
//			
//			System.out.println("값이 양수 입니다.");
//			
//		} else if (x < 0) {
//			
//			System.out.println("값이 음수 입니다.");
//			
//		} else {
//			
//			System.out.println("값이 0 입니다.");
//		// 왜 , 조건문에 (x = 0) 안될까 ? (x == 0) 은 된다.
//			
//		}
//	}
//}