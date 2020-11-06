package ch03;

import java.util.Scanner;
/*
[문제 3-1-58] 키보드로 입력한 정숫값이 음이면 "이 값은 음의 값입니다." 라고 표시하는 프로그램을 작성하자. 

실행 결과
정숫값:-10
이 값은 음의 값입니다.

정숫값:35
*/
public class E01Nagative {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정숫값 : ");
		
		int x = scanner.nextInt();
		
		if(x < 0) {
			System.out.println("이 값은 음의 값 입니다.");
		} else {
			System.out.println("정숫값 : " + x);
		}
	}
}