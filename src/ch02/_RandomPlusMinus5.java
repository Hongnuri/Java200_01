package ch02;

import java.util.Random;
import java.util.Scanner;

/*
[문제 2-12-46] 키보드에서 입력한 정숫값을 +5 또는 -5 범위의 랜덤 정숫값을 생성하자.
실행 결과 :
정숫값:7
입력 값의 ±5 범위의 난수를 생성했습니다.
값은 11입니다.
*/

class RandomPlusMinus5 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정숫값:");
		
		int x = scanner.nextInt();
		
		System.out.println("입력 값의 ±5 범위의 난수를 생성했습니다.");
		System.out.print("값은 " + ((x - 5) + random.nextInt(10)) + "입니다." );
	}
}




























//class RandomPlusMinus5 {
//
//	public static void main(String[] args) {
//		
//		Random rand = new Random(); // 난수생성과 입력생성시 난수생성이 먼저이다.
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("정숫값:");
//		int x = scanner.nextInt();
//		
//		System.out.print("입력 값의 ±5 범위의 난수를 생성했습니다.\n");
//		System.out.print("값은" + (x-5 + rand.nextInt(11)) + "입니다."); 
// 								// 왜 , x-5 이고 , 왜 , 11까지인가 ?
//	}
//}
