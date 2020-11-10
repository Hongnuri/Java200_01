package ch04;

import java.util.Scanner;

/*
[문제 04-08-120] 읽은 값의 개수 만큼 '*' 와 '+' 를 번갈아 가며 표시하는 프로그램을 작성하자. 
(마지막에는 줄 바꿈 문자를 출력할 것.)

실행 결과
몇 개를 표시할까요 ? : 12
*+*+*+ ...

몇 개를 표시할까요 ? : 11
*+*+*+ ...
*/
//public class _E08PutAsteriskAlt1 {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		int n = scanner.nextInt();
//		if(n>0) {
//			int i = 0;
//			while(i<n) {
//				if(i%2==0) { // i 가 짝수이면 '*' 를 출력
//					System.out.println('*');
//				} else { // i 가 홀수이면 '+' 를 출력
//					System.out.println('+');
//				i++;	
//				}
//				System.out.println();
//			}
//		}
//	}
//}

//public class _E08PutAsteriskAlt1 {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		if(n>0) {
//			int i = 0;
//			while(i<n/2) {
//					System.out.print("*+");
//					i++;
//				} 
//				if(n%2==1)
//					System.out.print('*');
//				System.out.println();				
//			}
//	}	
//}