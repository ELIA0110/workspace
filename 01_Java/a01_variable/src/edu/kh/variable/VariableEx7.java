package edu.kh.variable;

import java.util.Scanner; // Scanner 가져오기

public class VariableEx7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 생성하기
		
		// 이름 : 이유진
		// 나이 : 20
		// 성별 : 남자
		// 키 : 180.8
		// 희망 재산 : 1000000000000
		
		// 이유진님은 20세 남자이며 키는 180.8cm, 희망 재산은 1000000000000원 입니다.

		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("성별 : ");
		String gender = sc.next();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.print("희망 재산 : ");
		long property = sc.nextLong();
		
		
		String result = name + "님은 ";
		result = result + age +  "세 ";
		result = result	+ gender + "이며 ";
		result = result + "키는 " + height + "cm, ";
		result = result + "희망 재산은 " + property + "원 입니다.";
		
		System.out.print(result);
		
	}

}
