package edu.kh.operator.ex;

import java.util.Scanner; 

public class OperatorEx1 {
	public static void main(String[] args) {
		
		// 산술 연산자
		// + - * / %(modulo, mod, 나머지 연산)
		
		// 두 수를 입력받아 + _ * / % 연산 결과를 모두 출력
		
		// [예시]
		// 정수 입력 1 : 5
		// 정수 입력 2 : 2
		//
		// 5 + 2 = 7
		// 5 - 2 = 3
		// 5 * 2 = 10
		// 5 / 2 = 2.5
		// 5 % 2 = 1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 1 :");
		int input1 = sc.nextInt();
		
		System.out.print("정수 입력 2 :");
		int input2 = sc.nextInt();
		
		System.out.println(); // 아무것도 넣지 않았으니까 그냥 줄만 바꿈 (개행)
		
		// + 연산 : 5 + 2 = 7 
		System.out.println(input1 + " + " + input2 + " = " + (input1 + input2));
		
		// - 연산 : 5 - 2 = 7
		int minusResult = input1- input2; // 입력 받은 값의 - 결과를 저장
		System.out.println(input1 + " - " + input2 + " = " + minusResult);
		
		// * 연산 (printf 사용)
		
		// %d : 10진수 정수가 들어오는 칸
		// %f : 10진수 실수가 들어오는 칸
		// %.1f : 소수점 1자리까지 표현
		// %.2f : 소수점 2자리까지 표현
		// %.3f : 소수점 3자리까지 표현
		
		//System.out.printf("빈캄이 포함된 문자열" , 빈칸에 들어갈 값);
		System.out.printf("%d * %d = %d" , input1,input2,input1*input2);
		
		System.out.println();
		
		// /연산
		System.out.printf("%d / %d = %d" , input1,input2,input1/input2);
		// int 끼리 나누기를 했으므로 2.5가 아니라 소수점 자리가 없어진 2가 된다.
		// 5/2의 결과를 2.5로 나오게 하려면
		// input1 또는 input2를 (double)로 강제 형변환하면 된다. 왜?
		//(double)input / input2 -> double / int -> double / double(자동형변환)
		System.out.println();
		System.out.printf("%d / %d = %.1f" , input1,input2,(double)input1 / input2);
		
		System.out.println();

		
		
		// % (나머지) 연산 -> 몫이 정수로 다 나눠진 후 나머지가 출력
		
		System.out.printf("%d %% %d = %d", input1, input2,input1 % input2);
		// %% -> printf에서 문자열 "%"를 의미하는 기호
		
	}

}