package edu.kh.variable;

public class VariableEx1 {
	
	public static void main (String[] args) {
		
		System.out.println("[변수 사용 X]");
		/* - 값의 의미를 알 수 없다.
		   - 같은 값을 반복해서 작성해야 한다.
		   - 가독성이 떨어진다.
		   - 유지 보수가 힘들다.
		*/
		
		System.out.println(2 * 3.14150265389793 * 10);
		System.out.println(3.14150265389793 * 10 * 10);
		System.out.println(3.14150265389793 * 10 * 10 * 20);
		System.out.println(4 * 3.14150265389793 * 10 * 10);
		
		System.out.println("--------------------------");
		
		System.out.println("[변수 사용 O]");
		
		// 변수 선언 및 초기화
		double pi = 3.14150265389793; // 원주율
		int r = 10; // 반지름
		int h = 20; // 높이
		
		System.out.println(2 * pi * r); // 원의 둘레
		System.out.println(pi * r * r); // 원의 넓이
		System.out.println(pi * r * r * h); // 원기둥의 부피
		System.out.println(4 * pi * r * r); // 구의 겉넓이
		
		/* 변수란?
		- 메모리(RAM)에 값을 기록하는 공간
		- 공간에 기록되는 값이 변할 수 있어서 변수라고 한다.
		- 변수의 장점
		  1) 값의 의미를 파악할 수 있음
		  2) 같은 값을 한번만 작성 -> 재사용성 증가
		  3) 가독성 증가
		  4) 유지 보수 용이하다 (수정이 쉽다)
		  
		*/
		
		
		
	}
}
