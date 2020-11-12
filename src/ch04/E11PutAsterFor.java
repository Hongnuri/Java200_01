package ch04;

import java.util.Scanner;

/*
[문제 04-11-129] 기호 문자를 임의의 개수 만큼 출력했던 [문제 04-07] 을 for 문으로 작성하자.

실행 결과
몇 개의 * 를 표시할까요 ? : 12
************
*/
public class E11PutAsterFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇 개의 * 를 표시할까요 ?");
		
		int n = scanner.nextInt();	
		
		if(n>0) {
			for(int i=0; i<n; i++) {
				System.out.print('*');
				System.out.println();
			}
		}
	
	}
}