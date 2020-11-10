package ch04;

import java.util.Scanner;

/*
[문제 04-01-106] 정숫값의 부호를 판정해서 표시하는 Sign 프로그램인 [문제 03-05] 를 원하는 만큼 반복해서 입력 및 표시하도록 수정하자.

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

실행 결과
정숫값 : 12
이 값은 양수입니다.
다시 한 번 ? 1-Yes / 0-No:1
정숫값 : -531
이 값은 음수 입니다.
다시 한 번 ? 1-Yes / 0-No : 0
*/

class E01SignRepeat{
	public static void main(String[] args) {
	
		
	}
}	





















//public class _E01SignRepeat {
//	
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//
//		int retry; // 다시 한 번 문장을 맨 위에 스캐너 다음에 놓는 이유는 한 바퀴 돌아서 여기로 왔을 때 , 다시 돌려야하기 때문이다.
//	
//		do {
//			System.out.println("정숫값 : ");
//			int x = scanner.nextInt();
//			
//			if(x>0) {
//				System.out.println("+");
//			} else if(x<0) {
//				System.out.println("-");
//			} else {
//				System.out.println("0");
//			}
//			System.out.println("againt ? 1-Y / 2-N");
//			retry = scanner.nextInt(); // 맨 위에 선언한 retry 입력문을 작성해야한다.
//		} while(retry==1); // 1이 나오면 반복 되도록 한다. 그리고 다시 맨 위에 int retry; 로 올린다.
//	}
//}