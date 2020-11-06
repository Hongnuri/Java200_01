package ch04;

import java.util.Scanner;

/*
[문제 04-05-115] 입력 받은 정숫값부터 0까지 카운트다운하는 프로그램을 작성하라. 
카운트다운 종료 후의 변숫값을 확인할 수 있게 할 것.

실행 결과
카운트다운 합니다.
양의 정숫값 : -3
양의 정숫값 : 5
5
4
3
2
1
0
x의 값이 -1이 됐습니다.
*/

class _E05CountDown{
	public static void main(String[] args) {
		
		
	}
}





















//public class _E05CountDown {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("카운트다운 합니다.");
//		
//		int x;
//		
//		do {
//			System.out.print("양의 정숫값 : ");
//			x = scanner.nextInt();
//		} while(x<=0); // ; 이 있는 이유는 0 보다 작을시 다시 반복시켜야하기 때문이다.
//		
//		
//		while(x>=0) // 여기에 ; 이 없는 이유는 원래 while 문이 ; 이 없을 뿐만 아니라 위에서 반대조건(0 보다 큰)이 내려와서 출력하면 되기 때문이다.
//			System.out.println(x--); // x 값을 표시한 후 , 하나씩 감소 시킨다.
//			System.out.println("x의 값이" + x + "이 됐습니다.");
//	}
//}