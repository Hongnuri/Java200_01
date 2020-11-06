package ch04;

import java.util.Scanner;

/*
[문제 04-06-117] [문제-04-05] 에서 x-- 를 --x 로 고치면 어떻게 출력이 바뀌는지 검증하자. 프로그램을 작성해서 실행결과를 확인할 것.

실행 결과
카운트다운 합니다.
양의 정숫값 : 4
3
2
1
0
-1
x의 값이 -1이 됐습니다.
*/
public class E06CountDownPre {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x;
		
		do {
			System.out.println("양의 정숫값 : ");
			x = scanner.nextInt();
		} while (x<=0);
		
		while(x>=0)
			System.out.println(--x); // x-- 는 입력값도 출력하고 카운트다운한다. 하지만 --x 는 입력값 -1 부터 출력 된다.
			System.out.println("x의 값이 " + x + "이 됐습니다.");
	}
}
