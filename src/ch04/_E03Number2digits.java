package ch04;

import java.util.Random;
import java.util.Scanner;

/*
[문제 04-03-110] 2자리의 정숫값(10 ~ 99) 을 맞추는 '숫자 맞추기 게임' 을 만들자.
단 , 난수 생성과 if문 , do문을 사용하시오.

실행 결과
숫자 맞추기 게임 시작 !
10부터 99 사이의 숫자를 맞추세요.
어떤 숫자일까 ? : 50
더 큰 숫자입니다.
어떤 숫자일까 ? : 75
정답입니다.
*/

class _E03Number2digits{
	public static void main(String[] args) {

		
	}		
}
























//public class _E03Number2digits { 
//
//	public static void main(String[] args) { 
//
//		Random random = new Random(); 
//		Scanner scanner = new Scanner(System.in); 
//		
//		int rnum = 10 + random.nextInt(90); 
		/*
		조건은 불변이므로 do ~ while 문 안에 넣지 않는다.
		입력값 x 가 아니라 난수 rnum 을 선언하고 , 난수이므로 random 을 사용한다. 
		범위는 10 ~ 99
		*/

// 		int x; // 난수 rnum 이 아닌 입력값 x 생성

//		System.out.println("숫자 맞추기 게임 시작 !"); 
//		System.out.println("10 부터 99 사이의 숫자를 맞추세요."); 
//		
//		
//		
//		do {
//			System.out.println("어떤 숫자일까 ?"); // 반복 될 첫 문장
//			x = scanner.nextInt(); // 반복 될 첫 문장 다음에 입력문
//			
//			if(x>rnum) { // 질문 생성
//				System.out.println("더 작은 숫자 입니다.");
//			} else if (x<rnum) { // else 로 처리하게 되면 더 작은 숫자입니다 또는 더 큰 숫자입니다 까지 안내가 같이 나온다.
//				System.out.println("더 큰 숫자입니다.");
//			}
//		} while (rnum != x); // 'rnum 과 x 가 다르면 돌리는게 while 문이므로 != 가 맞다.
//		System.out.println("정답입니다.");
//	}
//}
