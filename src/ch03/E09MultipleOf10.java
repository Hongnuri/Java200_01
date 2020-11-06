package ch03;

import java.util.Scanner;

/*
[문제 03-09-72] 입력한 정숫값이 10의 배수이면 '이 값은 10의 배수입니다.' 라고 표시하고 , 그렇지 않으면 '이 값은 10의 배수가 아닙니다.' 라고 표시하는 프로그램을 작성하라.
(음수를 읽은 경우 '음의 정숫값을 입력했습니다.' 라고 표시할 것.) 

실행 결과 :
정숫값 : 1250
이 값은 10의 배수입니다.

정숫값 : 1254
이 값은 10의 배수가 아닙니다.
*/

public class E09MultipleOf10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정숫값 : ");
		
		int x = scanner.nextInt();
		
	}
}












//public class E09MultipleOf10 {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("정숫값 : ");
//		
//		int x = scanner.nextInt();
//		
//		if (x > 0) {
//			if (x % 10 == 0) {
//				System.out.println("이 값은 10의 배수입니다.");
//			} else {
//				System.out.println("이 값은 10의 배수가 아닙니다.");
//			}
//		} else {
//			System.out.println("음의 정숫값을 입력했습니다.");
//		}
//	}
//}