package ch03;

import java.util.Scanner;

/*
[문제 03-16-84] 키보드에서 입력한 3개의 정숫값 중 , 중앙값을 구해서 표시하는 프로그램을 작성하자.
예를 들어 2, 3, 1 의 중앙 값은 2 이고 , 1, 2, 1 의 중앙값은 1 이고 , 3, ,3, 3의 중앙 값은 3이다.
단 , if문과 논리 연산자를 이용하시오.

실행 결과
정수 a : 152
정수 b : 324
정수 c : 75
중앙값은 152 입니다.
*/

public class E16Med3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 a : ");
		
		int a = scanner.nextInt();
		
		System.out.println("정수 b : ");
		
		int b = scanner.nextInt();
		
		System.out.println("정수 c : ");
		
		int c = scanner.nextInt();

	
	}				
}























//public class _Med3 {
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
//		System.out.println("정수 c : ");
//		
//		int c = scanner.nextInt();
//		
//		int med;
//		// 중앙값으로 출력 할 med 선언
//		
//		if ((b >= a && a >= c) || (c >= a && a >= b)) { 
//		
//		med = a;
//		
//		} else if ((a >= b && b >= c) || (c >= b && b >= a)) {
//		
//			med = b;
//			
//		} else { 
//		/*
//		왜 , else if 로 바꾼 후 , 위의 조건문을 작성하면 하단의 출력문이 오류가 날까 ?
//		그리고 else 를 사용하게 되면 if 와 else if 다음에 남는 값을 낸 것일까 ? 아니면 저 조건문의 반대로 일일이 작동하는 것일까 ? 
//		*/	
//		med = c;
//		
//		}
//		
//		System.out.println("중앙값은 " + med + "입니다.");
//		
//	}
//}	


//		if(a >= b) {
//			if (b >= c) {
//				med = b;
//			} else if (a <= c) {
//				med = a;
//			} else 
//			med = c;
//			
//		} else if (a > c) {
//			med = a;
//		} else if (b > c) {
//			med = c;
//		} else {
//			med = b;
//		}
//		
//		System.out.println("중앙값은 " + med + "입니다.");
//		
//	}
//}