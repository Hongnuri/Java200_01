package ch03;

import java.util.Scanner;

/*
[문제 03-21-95] 월을 1 ~ 12의 정숫값으로 읽어서 해당하는 계절을 표시하는 프로그램을 작성하자.
단 ,  if문을 쓰지 마시오.

실행 결과
몇 월 입니까 ? : 6
여름

몇 월 입니까 ? : 11
가을

몇 월 입니까 ? : 13
그런 월은 없습니다.
*/

class _E21Season {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("what");
		
		
	
	}
}








































//public class Season {
//
//	public static void main(String[] args) {
//	
//	Scanner scanner = new Scanner (System.in);
//	
//	System.out.print("몇 월 입니까 ? : ");
//	
//	int month = scanner.nextInt();
//	
//		if (month < 13) { // default 문 대신 if 를 사용하였다.
//			switch(month) {
//				case 1: case 2: 
//					System.out.println("겨울");
//					break;
//				case 3: case 4: case 5:
//					System.out.println("봄");
//					break;
//				case 6: case 7: case 8:
//					System.out.println("여름");
//					break;
//				case 9: case 10: case 11: case 12:
//					System.out.println("가을");
//					break;	
//				} 
//			} else {
//				System.out.println("그런 월은 없습니다.");
//		}
//	}
//}

//public class Season {
//
//	public static void main(String[] args) {
//	
//	Scanner scanner = new Scanner (System.in);
//	
//	System.out.print("몇 월 입니까 ? : ");
//	
//	int month = scanner.nextInt();
//	
//		
//		switch(month) {
//			case 1: case 2: 
//				System.out.println("겨울");
//				break;
//			case 3: case 4: case 5:
//				System.out.println("봄");
//				break;
//			case 6: case 7: case 8:
//				System.out.println("여름");
//				break;
//			case 9: case 10: case 11: case 12:
//				System.out.println("가을");
//				break;
//			default:
//				System.out.println("그런 월은 없습니다.");
//				break;
//		}
//	}
//}