package ch02;
/*
[문제 2-3-31] [문제 2-2] 와 동일한 프로그램의 변수 x,y에 실숫값을 대입하고 그 결과를 알아보자.
실행 결과 :
x의 값은 63.4입니다.
y의 값은 18.3입니다.
합계는 81.7입니다.
평균은 40.85입니다.
*/

class SumAveError {

	public static void main(String[] args) {
		
		double x;
		double y;
		
		x = 63.4;
		y = 18.3;
		
		System.out.println("x값은 " + x + "입니다.");
		System.out.println("y값은 " + y + "입니다.");
		System.out.println("합계는 " + (x+y) + "입니다.");
		System.out.println("평균은 " + ((x+y) / 2.0) + "입니다.");
		
		
	}
}
