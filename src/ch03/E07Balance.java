package ch03;
/*
[문제 03-07-69] 2개의 변수 a,b 값을 읽어서 a,b 대소 관계를 다음과 같이 표시하는 프로그램을 작성하자.
"a가 크다." , "b가 크다 " , "a 와 b 가 같다."

실행 결과 :
변수 a : 12
변수 b : 3
a가 크다.

변수 a : 5
변수 b : 15
b가 크다.
*/

import java.util.Scanner;

public class E07Balance {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("변수 a : ");
		
		int a = scanner.nextInt();
		
		System.out.print("변수 b : ");
		
		int b = scanner.nextInt();
		
		
	}	
}

























//public class Balance {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner (System.in);
//		
//		System.out.println("변수 a : ");
//		
//		int a = scanner.nextInt();
//		
//		System.out.println("변수 b : ");
//		
//		int b = scanner.nextInt();
//		
//		if (a > b) {
//			
//			System.out.println("a 가 크다.");
//			
//		} else if (a < b){
//			
//			System.out.println("b가 크다.");
//			
//		} else {
//			
//			System.out.println("a와 b가 같다.");
//		}
//	}
//}