package ch03;

import java.util.Scanner;

/*
[문제 03-11-74] 입력한 점수에 따라 수/우/미/양/가를 판정하는 프로그램을 작성하자.
단 , && 연산자를 이용하시오.

실행 결과 :
점수 : 68
미

점수 : 89
수

점수 : 102
잘못 된 점수 입니다.
*/

class E11Grade1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("점수 : ");
		
		int x = scanner.nextInt();
	}
}












// && 연산자 : if (x >= a && x <= b) 와 같이 논리곱 연산자 && 를 사용하면 grade 를 순서 상관없이 작성해도 된다.
//
//public class _Grade1 {
//	
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("점수 : ");
//		
//		int x = scanner.nextInt();
//		
//		if (x >= 89 && x <= 100) {
//		// 양 쪽 모두가 참이여야 한다.	

//			System.out.println("수");
//			
//		} else if (88 >= x && x >= 79) {
//			
//			System.out.println("우");
//			
//		} else if (78 >= x && x >= 69) {
//			
//			System.out.println("미");
//			
//		} else if (68 >= x && x >= 59) {
//			
//			System.out.println("양");
//			
//		} else if (58 >= x && x >= 49) {
//			
//			System.out.println("가");
//			
//		}
//	}
//}































//public class _Grade1 {
//	
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("점수 : ");
//		
//		int x = scanner.nextInt();
//					
//		if (x >= 0 && x <= 49 ) {
//			
//			System.out.println("가");
//			
//		} else if (x >= 50 && x <=59 ) {
//			
//			System.out.println("양");
//			
//		} else if (x >= 60 && x <= 69) {
//			
//			System.out.println("미");
//			
//		} else if (x >= 70 && x <= 79) {
//			
//			System.out.println("우");	
//			
//		} else if (x >= 80 && x <=100) {
//			
//			System.out.println("수");	
//			
//		}
//						
//	}
//		
//}