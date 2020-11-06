package ch02;

import java.util.Scanner;

/*
[문제 2-8-41] 2개의 실숫값을 입력 받아 그 합과 평균을 구하는 프로그램을 작성하자.
실행 결과:
x값:9.75
y값:2.5
합계는 12.25입니다.
평균은 6.125입니다.
*/
class SumAveDouble {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값");
		
		double x = scanner.nextDouble();
		// 변수 x 와 y 의 자료형은 소수점을 지닐 수 있는 double형으로 선언한다. 
		System.out.print("y값");
		
		double y = scanner.nextDouble();	
		
		double sum = x+y;
		
		double avg = ((x+y) / 2);
			
		System.out.println("x값: " + x);
		System.out.println("y값: " + y);
		System.out.println("합계는 " + sum + "입니다.");
		System.out.println("합계는 " + avg + "입니다.");
			
	}

}
