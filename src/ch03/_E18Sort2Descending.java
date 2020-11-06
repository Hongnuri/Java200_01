package ch03;

import java.util.Scanner;
/*
[문제 03-18-90] 2개의 정숫값을 내림차순(큰 순) 으로 정렬하는 프로그램을 작성하자.
조건 1. max 와 min 선언을 하지마시오.
조건 2. 변수  t 를 선언하여 교환하시오.

실행 결과
정수 a : 13
정수 b : 57
a >= b 가 되도록 정렬했습니다.
변수 a 는 57 입니다.
변수 b 는 13 입니다.
*/

class _E18Sort2Descending {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("a");
		int a=scanner.nextInt();
		System.out.println("b");
		int b=scanner.nextInt();
		
	
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}















































//public class Sort2Descending {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("정수 a : ");
//		
//		int a = scanner.nextInt();
//		
//		System.out.print("정수 b : ");
//		
//		int b = scanner.nextInt();
//		
//		int min , max;
//		
//		if (a > b) {
//			
//			min = b;
//			max = a;
//		} else {
//			min = a;
//			max = b;
//		}
//		System.out.println("a >= b 가 되도록 정렬했습니다.");
//		System.out.println("변수 a 는" + max + "입니다.");
//		System.out.println("변수 b 는" + min + "입니다.");
//	}
//}

//public class _E18Sort2Descending {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("정수 a : ");
//		
//		int a = scanner.nextInt();
//		
//		System.out.print("정수 b : ");
//		
//		int b = scanner.nextInt();
//	
//		if(b>a){ // b가 최솟값이 되게 해야한다. 즉 , b가 큰 경우가 if문으로 들어 오게 해야한다.
//			int t=a;
//			a=b;
//			b=t;
//		}
//		System.out.println("a >= b 가 되도록 정렬했습니다.");
//		System.out.println("변수 a는" +a+ "입니다.");
//		System.out.println("변수 b는" +b+ "입니다.");
//	} 	
//}

