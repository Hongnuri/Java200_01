package ch03;
/*
[문제 03-10-73] 입력한 정숫값을 3으로 나눈다. 그리고 그 결과에 따라 "이 값은 3으로 나누어집니다." , "이 값을 3으로 나눈 나머지는 1입니다." , "이 값을 3으로 나눈 나머지는 2 입니다." 중
하나를 표시하는 프로그램을 작성하자(단 , 양수가 아닌 경우 "양수가 아닌 값을 입력했습니다." 라고 표시할 것)

실행 결과 :
정숫값 : 1251
이 값은 3으로 나누어집니다.

정숫값 : 1253
이 값을 3으로 나눈 나머지는 2입니다.
*/

import java.util.Scanner;


































//public class E10Modulo3 {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("정숫값 : ");
//		
//		int x = scanner.nextInt();
//		
//		if (x < 0) {
//			System.out.println("양수가 아닌 값을 입력했습니다.");
//		} else {
//			if (x%3==0) {
//				System.out.println("이 값은 3으로 나누어집니다.");
//			} else if(x%3==1) {
//				System.out.println("이 값을 3으로 나눈 나머지는 1 입니다.");	
//			} else { // 결국 else 를 사용해도 상관 없는게 경우의 수는 3 가지 뿐이다.
//				System.out.println("이 값을 3으로 나눈 나머지는 2 입니다.");
//			}
//		}
//	}
//}