package edu.kh.operator.practice;

import java.util.Scanner;

public class practice4 {
	public static void main(String[] args) {
		/* 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 
		   청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.

			ex.
			나이 : 19
			청소년
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int input1 = sc.nextInt();
		
		String result = input1 > 19 ? "성인" : (input1 > 13 ? "청소년" : "어린이");
		System.out.println(result);
		// = String result = input1 <= 13 ? "어린이" : (input1 > 19 ? "성인" : "청소년");
		// 기준을 뭐로 잡느냐에 따라서 다르다.
	}

}
