package ch03;

import java.util.Scanner;

/*
[문제 3-4-64] 2개의 양의 정숫값을 읽어서 후자가 전자의 약수이면 "B는 A의 약수이다." 라고 표시하고 ,
그렇지 않으면 "B는 A의 약수가 아니다." 라고 표시하는 프로그램을 작성하자.
단 , 논리 부정 연산자 (!=) 를 사용하시오.

실행 결과
변수 A:12
변수 B:5
B는 A의 약수가 아닙니다. 
*/

public class E04Measure2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("변수 A: ");
		
		int a = scanner.nextInt();
		
		System.out.print("변수 B: ");
		
		int b = scanner.nextInt();
		
		
	}	
}
































//public class E04Measure2 {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//			
//		System.out.println("변수 A: ");
//		
//		int a = scanner.nextInt();
//		
//		System.out.println("변수 B: ");
//		
//		int b = scanner.nextInt();
//		
//		if (a % b != 0) { 
//			
//			// if (!(a % b == 0))
//			
//			System.out.println("B는 A 의 약수가 아니다.");
//			
//		} else {
//			
//			System.out.println("B는 A의 약수이다.");
//			
//		}
//		
//		int x = 1;
//		int y = 2;
//		
//		System.out.println(x >= 1 && y <=3);
//		
//	}
//}
