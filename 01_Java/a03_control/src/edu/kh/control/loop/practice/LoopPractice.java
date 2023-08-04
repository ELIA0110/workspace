package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	
	/* 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	단, 입력한 수는 1보다 크거나 같아야 합니다.
	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

	ex.
	1이상의 숫자를 입력하세요 : 4 		1이상의 숫자를 입력하세요 : 0
	1 2 3 4 							1 이상의 숫자를 입력해주세요.
   */
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
			if(num >= 1) {
				for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
				} 
			  } else {
				System.out.print("1 이상의 숫자를 입력해주세요.");
			}
		}
	
	
	/* 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	단, 입력한 수는 1보다 크거나 같아야 합니다.

	ex.
	1이상의 숫자를 입력하세요 : 4 		1이상의 숫자를 입력하세요 : 0
	4 3 2 1 							1 이상의 숫자를 입력해주세요.
    */
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			} 
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	
	/* 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.

		ex.
		정수를 하나 입력하세요 : 8
		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
	 */
	
	 public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num-1; i++) {
			System.out.print(i + " + ");
			sum = sum + i;
		}
		System.out.print(num + " = " + sum);
		/* for(int i = 1; i <= num; i++) {
			System.out.print(i);
			sum += i;
			
			if( i < num) {
			System.out.print(" + ");
			}	
		}
		System.out.print(" = "+ sum);
		 * 
		 */
	
	}
	/* 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	   만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

	ex.
	첫 번째 숫자 : 8 		첫 번째 숫자 : 4 		첫 번째 숫자 : 9
	두 번째 숫자 : 4 		두 번째 숫자 : 8 		두 번째 숫자 : 0
	4 5 6 7 8 				4 5 6 7 8 				1 이상의 숫자를 입력해주세요.
	 */
	
	 public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		// 입력 받은 두 수가 모두 1이상인가?
		if(num1 >= 1 && num2 >= 1) {
			
			// *** 쉬운 방법 ***
			// 작은 수부터 큰 수까지 1씩 증가하며  반복
			/*if(num1 <= num2) { // 먼저 입력한 수가 작거나 같을때
				
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else { // 나중에 입력한 수가 작을 때
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
						}
					}
				} else { 
			System.out.println("1이상의 숫자를 입력해주세요.");
			}
			 */
			
			// **변수를 이용하는 방법**
			if(num1 > num2) {
				//먼저 입력한 수가 더 큰 경우
				
				// 두 변수의 값 교환(임시 변수 필요)
				int temp = num1; // temp : 임시 변수
				// num1과 num2를 바꾸자고 할때 변수가 하나가 더 필요하다.
				num1 = num2;
				num2 = temp;
			} 
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
			
		
		
		}
		}
		
		
		
		
		
	/* 사용자로부터 입력 받은 숫자의 단을 출력하세요.

		ex.
		숫자 : 4
		===== 4단 =====
		4 * 1 = 4
		4 * 2 = 8
		4 * 3 = 12
		4 * 4 = 16
		4 * 5 = 20
		4 * 6 = 24
		4 * 7 = 28
		4 * 8 = 32
		4 * 9 = 36
	 */
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.printf("===== %d단 =====\n", num);
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d", num, i, num * i );
			System.out.println();	
		}
		
	}
	
	/* 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.

		숫자 : 4 							숫자 : 10
		===== 4단 ===== 					2~9 사이 숫자만 입력해주세요.
		===== 5단 =====
		===== 6단 =====
		===== 7단 =====
		===== 8단 =====
		===== 9단 =====
		(해당 단의 내용들은 길이 상 생략)
	 * 
	 */
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num >= 2 && num <= 9) {
		
			for(int i = num; i <= 9; i++) {
			System.out.printf("===== %d단 =====\n", i);
			
			for(int x = 1; x <= 9; x++) {
				System.out.printf("%d * %d = %d\n", i, x, i * x);
				}
			}
		} else {
			System.out.println("2 ~ 9 사이의 숫자만 입력해주세요.");
		}
}
	
	/* 다음과 같은 실행 예제를 구현하세요.

		ex.
		정수 입력 : 4
	 	*
	 	**
	 	***
	 	****
	 */
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int row = 1; row <= num; row++) { 
			
			for(int col = 1; col <= row; col++) {
			 
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	/* 다음과 같은 실행 예제를 구현하세요.

		ex.
		정수 입력 : 4
	 	****
	 	***
	 	**
	 	*
	  
	 */
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		
		for(int row = num; row >= 1; row--) {
			
			for(int col = row; col >= 1; col--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	/* 다음과 같은 실행 예제를 구현하세요.

		ex.
		정수 입력 : 4
	 	   *
	 	  **
	 	 ***
	 	****
	  
	 */
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		
		for(int row = 1; row <= num; row++) {
			
			for(int col = num; col >= 1; col--) {
				
				if(row >= col) {
					System.out.print("*");
			} else {
				System.out.print(" ");
			}
			
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		
		
		
		
	}
	
	
}
