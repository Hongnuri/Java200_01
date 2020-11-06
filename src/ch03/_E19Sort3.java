package ch03;

import java.util.Scanner;

/*
[문제 03-19-91] 3개의 정숫값을 오름차순(작은순) 으로 정렬하는 프로그램을 작성하자.
단 , int t 를 이용하시오.

실행 결과
정수 a : 53
정수 b : 35
정수 c : 42
a <= b <= c 가 되도록 정렬했습니다. 
변수 a 는 35 입니다.
변수 b 는 42 입니다.
변수 c 는 53 입니다.
*/

class _E19Sort3{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("a");
		int a = scanner.nextInt();
		System.out.println("b");
		int b = scanner.nextInt();
		System.out.println("c");
		int c = scanner.nextInt();
		
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}



































//public class _E19Sort3 {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("정수 a : ");
//		int a = scanner.nextInt();
//		
//		System.out.print("정수 b : ");
//		int b = scanner.nextInt();
//		
//		System.out.print("정수 c : ");
//		int c = scanner.nextInt();
//
//		if(a>b) { // 작은순으로 나열해야하므로 , 왼쪽 a가 b 보다 커서는 안된다. 따라서 값을 교환한다. 즉 , 교환을 위해 a 가 b 보다 큰 경우를 조건문에 넣어야하고 , 그런 경우에 변경해줘야 하기에 (a>b) 로 적는다.
//			int t= b;
//			b=a;
//			a=t;
//		}
//		if(b>c) { // 여기서 최댓값 c 를 정하게 된다.
//			int t=c;
//			c=b;
//			b=t;
//		}
//		if(a>b) { // 여기서 최솟값 결정전이다.
//			int t=b;
//			b=a;
//			a=t; // 이로써 a를 제일 밑에 두게 된다.
//		}
//		System.out.println("a <= b <= c 가 되도록 정렬했습니다.");
//		System.out.println("변수 a 는" +a+	"입니다.");
//		System.out.println("변수 b 는" +b+	"입니다.");
//		System.out.println("변수 c 는" +c+	"입니다.");
//	}	
//}