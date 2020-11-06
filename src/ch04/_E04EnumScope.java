package ch04;

import java.util.Scanner;

/*
[문제 04-04-112] 2개의 정숫값을 읽어서 두 정수 사이에 있는 모든 정숫값 작은 것부터 
큰 순으로 표시하는 프로그램을 작성하자.

실행 결과
정수 A : 33
정수 B : 28

28 29 30 31 32 33
*/

public class _E04EnumScope {

	public static void main(String[] args) {
		
	
		
	}		
}























//public class _E04EnumScope {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("정수 a : ");
//		int a = scanner.nextInt();
//		
//		System.out.println("정수 b : ");
//		int b = scanner.nextInt(); 
//		/*
//		두 정수를 입력하는 부분은 불변이다.
//		따라서 do ~ while 문 안에 넣지 않는다.
//		*/
//		
//		if(a>b) { // 숫자는 아무숫자나 입력 될 것이다. 그래서 오름차순 정렬이 필요하다. 변수 a 와 변수 b 를 오름차순 정렬하기 위해 a<=b 를 만들어야한다. 기분을 a 로 한 것이다. 따라서 조건문이 a>b 인 것이다.
//			int t=a;
//			a=b;
//			b=t;
//		}
//		do {
//			System.out.print(a+" "); // 가로로 출력되게 끔 한다.
//			a = a+1; // a = 하나씩 더한다.
//			
//		} while (a<=b); // 언제까지 ? a 부터 b까지 열거한다.
//
//		System.out.println();
//	}
//}