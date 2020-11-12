package ch04;
import java.util.Scanner;

/*
[문제 04-09-123] 양의 정숫값을 읽어서 그 자릿수를 출력하는 프로그램을 작성하자

실행 결과
양의 정숫값의 자릿수를 표시합시다.
양의 정숫값 : 1254
입력한 숫자는 4자리 입니다.
*/

public class E09DigitNo {

	public static void main(String[] args) {
	
	}		
}





















//public class E09DigitNo {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("양의 정숫값의 자릿수를 표시합니다.");
//		int x;
//		
//		do {
//			System.out.println("양의 정숫값 : ");
//			x=scanner.nextInt();
//		}while(x<=0);
//		
//		int digit=0; // 자릿수
//		while(x>0) {
//			digit++; // 자릿수를 증가시킨다.
//			x/=10; // x 를 10으로 나눈다.
//		}
//		System.out.println("입력한 숫자는 " + digit + "자리 입니다.");
//	}
//}